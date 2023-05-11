const greeting = (user) => {
  const userDisplay = typeof user === 'undefined' ? 'pessoa usuária' : user;
  console.log(`Welcome ${userDisplay}!`);
};

greeting(); // Welcome pessoa usuária!


const multiply = (number, value=1) => {
  return number * value
};

console.log(multiply(8));