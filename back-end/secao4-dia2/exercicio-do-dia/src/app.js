const express = require('express');

const app = express();
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

module.exports = app;
