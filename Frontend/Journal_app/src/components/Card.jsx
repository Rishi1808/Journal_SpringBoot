import React, { useEffect, useState } from "react";
import JournalEntryCard from "./JournalEntryCard";

const Card = () => {
    const [entries, setEntries] = useState([]);

    useEffect(() => {
        fetch("http://localhost:8080/journals")
            .then((response) => response.json())
            .then((data) => setEntries(data))
            .catch((error) => console.error("Error fetching journal entries:", error));
    }, []);

    return (
        <div className="p-4 grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
            {entries.map((entry) => (
                <JournalEntryCard
                    key={entry.id}
                    title={entry.title}
                    content={entry.content}
                    date={entry.date}
                />
            ))}
        </div>
    );
};

export default Card;
