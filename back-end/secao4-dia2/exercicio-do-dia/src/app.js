const express = require('express');

const app = express();
app.use(express.json());
const fs = require('fs').promises;
const path = require('path');

const moviesPath = path.resolve(__dirname, './movies.json');

const readFile = async () => {
  try {
    const data = await fs.readFile(moviesPath);
    return JSON.parse(data);
  } catch (error) {
    console.error(`Arquivo não pôde ser lido: ${error}`);
  }
};

app.get('/movies/:id', async (req, res) => {
  try {
     const { id } = req.params;
    const movies = await readFile();
    console.log(movies);
    const searchMovies = movies.find((movie) => movie.id === Number(id));
    res.status(200).json(searchMovies);
   } catch (err) {
     res.status(500).send({ message: err.message });
   }
 });

 app.get('/movies', async (_req, res) => {
  try {
    const movies = await readFile();
    res.status(200).json(movies);
  } catch (err) {
    res.status(500).send({ message: err.message });
  }
 });

 app.post('/movies', async (req, res) => {
  try {
    const { movie, price } = req.body;
    const movies = await readFile();
    const newMovie = {
      id: movies[movies.length - 1].id + 1,
      movie,
      price,
    };
    const allMovies = JSON.stringify([...movies, newMovie]);
    await fs.writeFile(moviesPath, allMovies);
    res.status(201).json(newMovie);
  } catch (err) {
    res.status(500).send({ message: err.message });
  }
});

app.put('/movies/:id', async (req, res) => {
  try {
    const { id } = req.params;
    const { movie, price } = req.body;
    const movies = await readFile();
    const movieIndex = movies.findIndex((movies1) => movies1.id === Number(id));
    movies[movieIndex] = { id: Number(id), movie, price };
    const updatedMovies = JSON.stringify(movies, null, 2);
    await fs.writeFile(moviesPath, updatedMovies);
    res.status(200).json(movies[movieIndex]);
  } catch (err) {
    res.status(500).send({ message: err.message });
  }
});


module.exports = app;
