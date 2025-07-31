import React from 'react';

const UserPage = () => {
  const flights = [
    { id: 1, from: 'Chennai', to: 'Delhi', price: 4000 },
    { id: 2, from: 'Mumbai', to: 'Bangalore', price: 3500 },
    { id: 3, from: 'Hyderabad', to: 'Kolkata', price: 5000 },
  ];

  const bookTicket = (flight) => {
    alert(`Ticket booked: ${flight.from} to ${flight.to}`);
  };

  return (
    <div className="page">
      <h2>Available Flights (User View)</h2>
      <ul>
        {flights.map((flight) => (
          <li key={flight.id}>
            {flight.from} ➡ {flight.to} - ₹{flight.price}
            <button onClick={() => bookTicket(flight)} style={{ marginLeft: '10px' }}>
              Book
            </button>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default UserPage;
