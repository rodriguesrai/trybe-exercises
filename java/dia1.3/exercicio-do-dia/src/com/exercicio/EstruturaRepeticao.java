package com.exercicio;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        String log = getLoop(); // Chama o método getLoop e atribui seu resultado à variável log
        System.out.println(log); // Imprime o resultado do método getLoop
    }

    private static String getLoop() {
        String log = ""; // Inicializa a variável log como uma string vazia

        for (int numero = 1; numero <= 10; numero++) {
            log += "O Número atual é: " + numero + "\n"; // Concatena a mensagem ao log
        }

        return log; // Retorna o log
    }
}
