import React from 'react';
import { BrowserRouter as Router, Route, Switch, Link } from 'react-router-dom';

export default function AppRouter() {
  return (
    <Router>
      <nav><Link to='/'>Home</Link></nav>
      <Switch>
        <Route exact path='/'><h1>Home Page</h1></Route>
      </Switch>
    </Router>
  );
}
