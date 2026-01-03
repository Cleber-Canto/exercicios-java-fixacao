package com.loiane.cursojava.aula34;

public final class MinhaCalculadora {

    private MinhaCalculadora() {
        // Classe utilitária - não pode ser instanciada
    }

    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static int soma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int soma(int[] valores) {
        int total = 0;

        for (int valor : valores) {
            total += valor;
        }

        return total;
    }
}
