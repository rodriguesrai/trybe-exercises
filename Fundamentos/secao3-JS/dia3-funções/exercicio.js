let saldo = 100;

function somaSaldo(valor) {};

function subtraiSaldo(valor) {};

function multiplicaSaldo(valor) {};

function divideSaldo(valor) {};


function somaSaldo(valor) {
  return valor + saldo;
};

function subtraiSaldo(valor) {
  return saldo - valor;
};

function multiplicaSaldo(valor) {
  return valor * saldo;
};

function divideSaldo(valor) {
  return saldo / valor;
};

console.log(somaSaldo(300)); // 400
console.log(subtraiSaldo(50)); // 50
console.log(multiplicaSaldo(2)); // 200
console.log(divideSaldo(5)); // 20
