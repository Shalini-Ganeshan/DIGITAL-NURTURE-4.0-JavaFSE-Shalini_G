import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 85 },
    { name: "Rohit", score: 95 },
    { name: "Dhoni", score: 45 },
    { name: "Rahul", score: 60 },
    { name: "Pant", score: 75 },
    { name: "Shreyas", score: 55 },
    { name: "Hardik", score: 88 },
    { name: "Bumrah", score: 40 },
    { name: "Shami", score: 92 },
    { name: "Jadeja", score: 67 },
    { name: "Ashwin", score: 71 },
  ];

  const filteredPlayers = players.filter(player => player.score >= 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>

      <h3>Players with Score ≥ 70</h3>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
