let clientesTrybeBank = ['Ada', 'John', 'Gus'];

// escreva aqui sua função

function adicionaCliente (cliente) {
    if (typeof cliente === 'string') {
        clientesTrybeBank.push(cliente);
    } else {
        return 'O parâmetro passado deve ser do tipo "string"';
    }
}

console.log(adicionaCliente(true)); 
console.log(adicionaCliente('Alou'));
console.log(clientesTrybeBank);
