package com.exercicio;

public class Array {
    static String[] alunos = { "MARCOS", "ALINE", "LUCAS", "PATRICIA" };
    static String log;
    static int totalAlunos;

    public static void main(String[] args) {
        totalAlunos = alunos.length;
        log = "A lista de chamadas possui " + totalAlunos + " alunos\n";
        System.out.println(log);

        getArray();
    }

    public static void getArray() {
        int matricula;
        for (int posicao = 0; posicao < totalAlunos; posicao++) {
            matricula = posicao + 1;
            log = "Matricula: " + matricula + " Aluno: " + alunos[posicao] + "\n";
            System.out.println(log);
        }
    }
}
