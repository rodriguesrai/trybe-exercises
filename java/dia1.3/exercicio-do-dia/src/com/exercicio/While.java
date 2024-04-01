package com.exercicio;

public class While {
    // Cria um array com os inscritos
    static String[] inscritos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA", "JOAO", "FELIPE", "LUCIA", "ANTONIO", "FERNANDA",
            "MARCELA", "VITOR", "BEATRIZ", "JORGE", "JULIA" };
    static final int numeroVagas = 10;
    static String[] vagas = new String[numeroVagas];

    public static void main(String[] args) {
        preencheVaga();
    }

    public static void preencheVaga() {
        int vagaAtual = 0;
        String inscrito;
        String log;
        while (vagaAtual < numeroVagas) {
            inscrito = inscritos[vagaAtual];
            log = "Adicionando a inscrição: " + inscrito + " Na vaga: " + (vagaAtual + 1) + "\n";
            vagas[vagaAtual] = inscrito;
            System.out.println(log); // Imprime o log ao invés de retorná-lo
            vagaAtual++;
        }
    }
}
