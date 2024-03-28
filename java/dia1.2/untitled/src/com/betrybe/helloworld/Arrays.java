package com.betrybe.helloworld;

public class Arrays {

    public static void main(String[] args) {
        int[] arrayDeInteiros = {1,2,3,4,5,6,767,878,8,8,9,9,9};
        int[][] matriz = new int[2][10]; // inicializamos uma matriz, bem parecido com uma tabela de excel com coluna e linha
        String[] arrayDeString = new String[10];

        matriz[0][0] = 10;
        matriz[1][0] = 20;

        arrayDeString[0] = "Na Trybe";
        arrayDeString[1] = " eu aprendo Java!";

        System.out.println(arrayDeInteiros[3]); // 4
        System.out.println(matriz[0][0]); // 10
        System.out.println(matriz[1][5]); // 0
        System.out.println(arrayDeString[0] + arrayDeString[1]); // Na Trybe eu aprendo Java!
        System.out.println(arrayDeString.length); // 10
    }
}