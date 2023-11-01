const fs = require('fs').promises;

async function readAll() {
  const fileContent = await fs.readFile('./simpsons.json', 'utf-8');
  const simpsons = JSON.parse(fileContent);

  const string = simpsons.map(({ id, name }) => `${id} - ${name}`);
  string.forEach((element) => console.log(element));
}

async function main() {
  await readAll();
}

main();
