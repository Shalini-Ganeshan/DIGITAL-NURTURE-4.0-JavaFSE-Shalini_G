import React from 'react';

const GuestPage = () => {
  const flights = [
    { id: 1, from: 'Chennai', to: 'Delhi', price: 4000 },
    { id: 2, from: 'Mumbai', to: 'Bangalore', price: 3500 },
    { id: 3, from: 'Hyderabad', to: 'Kolkata', price: 5000 },
  ];

  return (
    <div className="page">
      <h2>Available Flights (Guest View)</h2>
      <ul>
        {flights.map((flight) => (
          <li key={flight.id}>
            {flight.from} ➡ {flight.to} - ₹{flight.price}
          </li>
        ))}
      </ul>
      <p>Please log in to book tickets.</p>
    </div>
  );
};

export default GuestPage;
