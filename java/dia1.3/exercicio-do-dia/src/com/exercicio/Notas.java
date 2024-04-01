package com.exercicio;

import java.lang.String;

public class Notas {
    public static void main(String[] args) {
        double mediaFinal = 7.5;
        String resultado;
        if (mediaFinal >= 7) {
             resultado = "APROVADA";
        } else {
             resultado = "REPROVADA";
        }

        System.out.println("O resultado final é: " + resultado);
    }
}
