import React, { useState } from 'react';
import './App.css';
import CurrencyConvertor from './CurrencyConvertor';

const App = () => {
  const [count, setCount] = useState(0);

  const handleIncrement = () => {
    incrementValue();
    sayHello();
  };

  const incrementValue = () => {
    setCount(count + 1);
  };

  const sayHello = () => {
    console.log("Hello! Value increased");
  };

  const handleDecrement = () => {
    setCount(count - 1);
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleClickEvent = (event) => {
    alert("I was clicked");
  };

  return (
    <div className="App">
      <h1>🎯 Event Examples App</h1>

      <div className="counter-section">
        <h2>Counter Value: {count}</h2>
        <button onClick={handleIncrement}>Increment</button>
        <button onClick={handleDecrement}>Decrement</button>
      </div>

      <div className="welcome-section">
        <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>
      </div>

      <div className="synthetic-event-section">
        <button onClick={handleClickEvent}>Click Me</button>
      </div>

      <CurrencyConvertor />
    </div>
  );
};

export default App;
