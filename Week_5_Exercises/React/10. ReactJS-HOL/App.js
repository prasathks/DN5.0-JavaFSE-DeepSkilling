import React, { createContext, useContext } from 'react';

const ThemeContext = createContext('light');

export default function ThemeApp() {
  return (
    <ThemeContext.Provider value='dark'>
      <ThemedButton />
    </ThemeContext.Provider>
  );
}

function ThemedButton() {
  const theme = useContext(ThemeContext);
  return <button style={{ background: theme === 'dark' ? '#333' : '#FFF' }}>Button</button>;
}
