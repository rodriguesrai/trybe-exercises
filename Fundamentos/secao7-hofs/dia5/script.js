const primeNumbers = [17, 23, 37]
const [primeUm, primeDois, primeTres] = primeNumbers;
const sum = (a, b) => {
  console.log(a + b);
}

sum(primeUm, primeTres) // 54

// Produza o mesmo resultado acima, porém utilizando array destructuring

let comida = 'gato';
let animal = 'água';
let bebida = 'arroz';
[comida, animal, bebida] = [bebida, comida, animal]; // Criando o array e o desestruturando


console.log(comida, animal, bebida); // arroz gato água
console.log(comida, animal, bebida); // arroz gato água
// Utilizando array destructuring, faça com que os valores apareçam nas variáveis correspondentes ao seu verdadeiro tipo

let numerosPares = [1, 3, 5, 6, 8, 10, 12];

console.log(numerosPares); // [6, 8, 10, 12];

// Utilize array destructuring para produzir o resultado esperado pelo console.log acima

[,,, ...numerosPares] = numerosPares;

console.log(numerosPares); // [6, 8, 10, 12];

// Utilize array destructuring para produzir o resultado esperado pelo console.log acima