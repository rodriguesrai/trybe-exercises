// src/pages/home/index.tsx
import './home.css';
import { Link } from "react-router-dom";

function Home() {
  return (
    <>
      <h1>Coffeeteria</h1>
      <Link to="/coffees">
        <button>Conheça nossos produtos</button>
      </Link>
    </>
  )
}

export default Home;
