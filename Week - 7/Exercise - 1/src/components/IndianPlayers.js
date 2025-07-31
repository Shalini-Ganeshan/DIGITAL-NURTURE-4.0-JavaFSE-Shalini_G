import React from 'react';

const IndianPlayers = () => {
  const allPlayers = [
    "Virat", "Rohit", "Dhoni", "Rahul", "Pant", 
    "Shreyas", "Hardik", "Bumrah", "Shami", "Jadeja", "Ashwin"
  ];

  const oddPlayers = allPlayers.filter((_, index) => index % 2 === 0);
  const evenPlayers = allPlayers.filter((_, index) => index % 2 !== 0);

  // Destructuring example
  const [odd1, odd2, ...restOdd] = oddPlayers;
  const [even1, even2, ...restEven] = evenPlayers;

  // Merge two arrays
  const T20players = ["Virat", "Rohit", "Hardik"];
  const RanjiTrophyPlayers = ["Rahane", "Pujara"];
  const allCombinedPlayers = [...T20players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        <li>{odd1}</li>
        <li>{odd2}</li>
        {restOdd.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        <li>{even1}</li>
        <li>{even2}</li>
        {restEven.map((player, i) => (
          <li key={i}>{player}</li>
        ))}
      </ul>

      <h2>All Players (T20 + Ranji)</h2>
      <ul>
        {allCombinedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
