import React from 'react';
import './App.css';

const App = () => {
 
  const imageUrl = "https://images.unsplash.com/photo-1560448070-c948b8a9fdfd";

 
  const office = {
    name: "Sunshine Tech Park",
    rent: 55000,
    address: "Sector 21, Bengaluru"
  };

  
  const officeList = [
    {
      name: "Eco World Tower",
      rent: 75000,
      address: "Bellandur, Bengaluru"
    },
    {
      name: "WeWork Infinity",
      rent: 58000,
      address: "Koramangala, Bengaluru"
    },
    {
      name: "Mindspace",
      rent: 62000,
      address: "HiTech City, Hyderabad"
    },
    {
      name: "Tidel Park",
      rent: 45000,
      address: "Taramani, Chennai"
    }
  ];

 
  return (
    <div className="App">
      <h1>🏢 Office Space Rental App</h1>

      <img src={imageUrl} alt="Office Space" width="600px" />

      <h2>Featured Office</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p>
        <strong>Rent:</strong>{" "}
        <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
          ₹{office.rent}
        </span>
      </p>
      <p><strong>Address:</strong> {office.address}</p>

      <h2>Available Offices</h2>
      {officeList.map((item, index) => (
        <div key={index} className="office-card">
          <h3>{item.name}</h3>
          <p>
            <strong>Rent:</strong>{" "}
            <span style={{ color: item.rent < 60000 ? 'red' : 'green' }}>
              ₹{item.rent}
            </span>
          </p>
          <p><strong>Address:</strong> {item.address}</p>
        </div>
      ))}
    </div>
  );
};

export default App;
