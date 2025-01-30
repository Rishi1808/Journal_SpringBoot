import React from 'react';

const Card = ({ journal }) => {
  return (
    <div className="card">
      <img src={journal.imageUrl} alt={journal.title} className="card-img" />
      <div className="card-body">
        <h5 className="card-title">{journal.title}</h5>
        <p className="card-text">{journal.description}</p>
        <a href={journal.link} className="btn btn-primary">Read More</a>
      </div>
    </div>
  );
};

export default Card;
