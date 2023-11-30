// src/app.js
require('dotenv').config();

const app = express();

app.use(express.json());


module.exports = app;