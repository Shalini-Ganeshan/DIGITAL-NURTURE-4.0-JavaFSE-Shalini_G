import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const name = "Shalini Ganeshan";
  const school = "ABC Matriculation School";
  const total = 450;
  const goal = 5; 

  const average = total / goal;

  return (
    <div className="score-container">
      <h2>Student Score Report</h2>
      <p><strong>Name:</strong> {name}</p>
      <p><strong>School:</strong> {school}</p>
      <p><strong>Total Score:</strong> {total}</p>
      <p><strong>Goal:</strong> {goal}</p>
      <p className="average"><strong>Average Score:</strong> {average}</p>
    </div>
  );
}

export default CalculateScore;
