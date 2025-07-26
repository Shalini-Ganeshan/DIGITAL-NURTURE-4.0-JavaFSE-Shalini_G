import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohortList = [
    {
      name: 'React Bootcamp',
      mentor: 'John Doe',
      status: 'ongoing',
      startDate: '2025-07-01',
      endDate: '2025-08-01',
    },
    {
      name: 'Java Fundamentals',
      mentor: 'Jane Smith',
      status: 'completed',
      startDate: '2025-05-01',
      endDate: '2025-06-01',
    },
    {
      name: 'Python Basics',
      mentor: 'Sara Lee',
      status: 'ongoing',
      startDate: '2025-07-10',
      endDate: '2025-08-10',
    },
  ];

  return (
    <div style={{ textAlign: 'center', marginTop: '20px' }}>
      <h1>My Academy - Cohort Dashboard</h1>
      {cohortList.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
