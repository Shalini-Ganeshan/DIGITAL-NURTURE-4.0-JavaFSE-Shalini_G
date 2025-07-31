import React, { useState } from 'react';

const CurrencyConvertor = () => {
  const [rupees, setRupees] = useState('');
  const [euros, setEuros] = useState('');

  const handleInputChange = (e) => {
    setRupees(e.target.value);
  };

  const handleSubmit = () => {
    const conversionRate = 90; 
    const result = parseFloat(rupees) / conversionRate;

    if (!isNaN(result)) {
      setEuros(result.toFixed(2));
    } else {
      setEuros("Invalid input");
    }
  };

  return (
    <div className="currency-section">
      <h2>Currency Convertor</h2>
      <input
        type="number"
        placeholder="Enter amount in INR"
        value={rupees}
        onChange={handleInputChange}
      />
      <button onClick={handleSubmit}>Convert</button>
      <p>💶 Euros: {euros}</p>
    </div>
  );
};

export default CurrencyConvertor;
