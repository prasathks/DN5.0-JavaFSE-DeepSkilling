import React, { useState, useEffect } from 'react';

export default function DataFetcher() {
  const [data, setData] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const timer = setTimeout(() => {
      setData({ id: 1, message: 'Fetched Data Successfully!', timestamp: new Date().toISOString() });
      setLoading(false);
    }, 1500);
    return () => clearTimeout(timer);
  }, []);

  if (loading) return <div>Loading data from server...</div>;
  
  return (
    <div className='data-container'>
      <h2>Data Result</h2>
      <pre>{JSON.stringify(data, null, 2)}</pre>
    </div>
  );
}
