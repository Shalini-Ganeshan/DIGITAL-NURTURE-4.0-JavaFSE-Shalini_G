import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import './App.css';

const App = () => {
  const [view, setView] = useState('book');
  const [showBlog, setShowBlog] = useState(true);
  const [activeView, setActiveView] = useState('book');

  const renderByIfElse = () => {
    if (view === 'book') {
      return <BookDetails />;
    } else if (view === 'blog') {
      return <BlogDetails />;
    } else {
      return <CourseDetails />;
    }
  };

  const renderBySwitch = () => {
    switch (activeView) {
      case 'book':
        return <BookDetails />;
      case 'blog':
        return <BlogDetails />;
      case 'course':
        return <CourseDetails />;
      default:
        return null;
    }
  };

  return (
    <div className="App">
      <h1>📚 Blogger App</h1>

      <h2>Conditional Rendering using If-Else</h2>
      <div className="button-group">
        <button onClick={() => setView('book')}>Book</button>
        <button onClick={() => setView('blog')}>Blog</button>
        <button onClick={() => setView('course')}>Course</button>
      </div>
      {renderByIfElse()}

      <h2>Conditional Rendering using Ternary</h2>
      {view === 'book' ? (
        <BookDetails />
      ) : view === 'blog' ? (
        <BlogDetails />
      ) : (
        <CourseDetails />
      )}

      <h2>Conditional Rendering using &&</h2>
      <button onClick={() => setShowBlog(!showBlog)}>
        {showBlog ? 'Hide Blog' : 'Show Blog'}
      </button>
      {showBlog && <BlogDetails />}

      <h2>Conditional Rendering using Switch-Case</h2>
      <div className="button-group">
        <button onClick={() => setActiveView('book')}>Book</button>
        <button onClick={() => setActiveView('blog')}>Blog</button>
        <button onClick={() => setActiveView('course')}>Course</button>
      </div>
      {renderBySwitch()}
    </div>
  );
};

export default App;
