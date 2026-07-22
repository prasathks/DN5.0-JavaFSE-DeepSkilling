import React, { useState } from 'react';

export default function FormExample() {
  const [name, setName] = useState('');
  const handleSubmit = (e) => {
    e.preventDefault();
    alert('Submitted: ' + name);
  };
  return (
    <form onSubmit={handleSubmit}>
      <input value={name} onChange={(e) => setName(e.target.value)} placeholder='Name' />
      <button type='submit'>Submit</button>
    </form>
  );
}
