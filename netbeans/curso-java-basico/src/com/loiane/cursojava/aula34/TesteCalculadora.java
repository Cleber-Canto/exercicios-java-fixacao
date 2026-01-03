package com.loiane.cursojava.aula34;

public class TesteCalculadora {

    public static void main(String[] args) {

        int resultado = MinhaCalculadora.soma(1, 2);
        System.out.println("Soma 2 valores: " + resultado);

        int resultado3 = MinhaCalculadora.soma(1, 2, 3);
        System.out.println("Soma 3 valores: " + resultado3);

        int[] numeros = {1, 2, 3, 4};
        int resultadoVetor = MinhaCalculadora.soma(numeros);
        System.out.println("Soma vetor: " + resultadoVetor);
    }
}

