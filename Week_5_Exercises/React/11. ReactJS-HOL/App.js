import { createStore, combineReducers } from 'redux';

const counterReducer = (state = 0, action) => {
  switch (action.type) {
    case 'INCREMENT': return state + 1;
    case 'DECREMENT': return state - 1;
    case 'RESET': return 0;
    default: return state;
  }
};

const userReducer = (state = null, action) => {
  if (action.type === 'SET_USER') return action.payload;
  return state;
};

const rootReducer = combineReducers({
  counter: counterReducer,
  user: userReducer
});

export const store = createStore(rootReducer);
