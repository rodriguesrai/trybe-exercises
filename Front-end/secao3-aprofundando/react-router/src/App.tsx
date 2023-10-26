// src/App.tsx

import { Route, Routes } from 'react-router-dom';
import Home from './pages/home';
import CoffeeList from './pages/coffee-list';
import Coffee from './pages/coffee';
import NavBar from './components/nav-bar';

function App() {
  return (
    <>
    <NavBar />
    <Routes>
      <Route path="/" element={ <Home /> } />
      <Route path="/coffees" element={ <CoffeeList /> } />
      <Route path="/coffees/:coffee" element={ <Coffee /> } />
    </Routes>
    </>
  )
}

export default App;
