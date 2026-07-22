import React, { useState } from 'react';

export default function Counter(props) {
  const [count, setCount] = useState(0);
  return (
    <div>
      <h2>{props.title}</h2>
      <p>Current Count: {count}</p>
      <button onClick={() => setCount(count + 1)}>Increment</button>
    </div>
  );
}
