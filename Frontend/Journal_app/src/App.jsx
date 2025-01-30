import React, { useEffect, useState } from 'react';
import Card from './components/Card';

const App = () => {
  const [journals, setJournals] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    // Fetch journals from the local API
    fetch('http://localhost:8080/journals') // API endpoint for journals
      .then((response) => {
        if (!response.ok) {
          throw new Error('Failed to fetch journals');
        }
        return response.json();
      })
      .then((data) => {
        setJournals(data);  // Set the fetched journals
        setLoading(false);   // Stop loading when data is fetched
      })
      .catch((error) => {
        setError(error.message);  // Set error if fetching fails
        setLoading(false);        // Stop loading in case of error
      });
  }, []);

  if (loading) {
    return <div className="text-center">Loading journals...</div>;
  }

  if (error) {
    return <div className="text-center text-danger">Error: {error}</div>;
  }

  return (
    <div className="container">
      <h1 className="text-center my-4">Journals</h1>
      <div className="row">
        {journals.map((journal) => (
          <div className="col-md-4" key={journal.id}>
            <Card journal={journal} />
          </div>
        ))}
      </div>
    </div>
  );
};

export default App;
