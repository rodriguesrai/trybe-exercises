package com.debug;

// NumerosImpares.java
public class NumerosImpares {
    public static void imprimir() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}