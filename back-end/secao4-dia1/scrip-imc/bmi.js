const readline = require('readline-sync');

const main = () => {
  const weight = readline.questionFloat('Weight: ');
  const height = readline.questionFloat('Height: ');
  const bmi = weight / height ** 2;
  let classification = '';

  if (bmi < 18.5) {
    classification = 'Abaixo do peso (magreza)';
  } else if (bmi >= 18.5 && bmi <= 24.9) {
    classification = 'Peso normal';
  } else if (bmi >= 25 && bmi <= 29.9) {
    classification = 'Acima do peso (sobrepeso)';
  } else if (bmi >= 30 && bmi <= 34.9) {
    classification = 'Obesidade grau I';
  } else if (bmi >= 35 && bmi <= 39.9) {
    classification = 'Obesidade grau II';
  } else {
    classification = 'Obesidade graus III e IV';
  }
  
  console.log(`Your BMI is ${bmi.toFixed(2)}`);
  console.log(`Classification: ${classification}`);
}

module.exports = main;

