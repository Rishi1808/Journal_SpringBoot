Journal App

This is a simple React application that fetches journal entries from a backend API and displays them in a card layout.

Features

Fetches journal data from http://localhost:8080/journals.

Displays journals in a card component.

Handles loading and error states.

Uses React functional components and hooks.

Installation

Prerequisites

Node.js (v14 or later)

A running backend API on http://localhost:8080/journals.

Steps

Clone the repository:

git clone https://github.com/your-repo/journal-app.git
cd journal-app

Install dependencies:

npm install

Start the React app:

npm start

Project Structure

📂 journal-app
│-- 📂 src
│   │-- 📜 App.jsx        # Main component fetching and displaying journals
│   │-- 📜 Card.jsx       # Card component for individual journals
│   │-- 📜 index.js       # Entry point
│-- 📜 package.json      # Project dependencies
│-- 📜 README.md         # Project documentation

API Endpoint

The application fetches journals from:

GET http://localhost:8080/journals

Expected API Response Format:

[
  {
    "id": 1,
    "title": "Journal 1",
    "description": "This is the first journal.",
    "imageUrl": "https://example.com/image1.jpg",
    "link": "https://example.com/journal1"
  },
  {
    "id": 2,
    "title": "Journal 2",
    "description": "This is the second journal.",
    "imageUrl": "https://example.com/image2.jpg",
    "link": "https://example.com/journal2"
  }
]

Technologies Used

React.js

JavaScript (ES6+)

Bootstrap (for styling)

Troubleshooting

If the API request fails, ensure the backend is running on http://localhost:8080.

Check browser console for network errors.

If CORS issues occur, update backend CORS settings.

License

This project is licensed under the MIT License.

