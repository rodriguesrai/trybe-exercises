let clientesTrybeBank = ['Ada', 'John', 'Gus'];

function verificaSring(cliente) {
    if (typeof cliente === 'string') {
        let clienteEncontrado = false;
    } else {
        return 'O parâmetro passado deve ser do tipo "string"!';
    }
}
function removeCliente(cliente) {
    for (let index = 0; index < clientesTrybeBank.length; index += 1) {
        if (cliente === clientesTrybeBank[index]) {
            clientesTrybeBank.splice(index, 1);
            clienteEncontrado = true;
            return 'Cliente excluída(o) com sucesso.';
        }
    }

    if (clienteEncontrado === false) {
        return 'Cliente não encontrado'
    }
} 
   