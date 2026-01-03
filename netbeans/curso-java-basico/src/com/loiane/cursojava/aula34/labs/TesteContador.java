package com.loiane.cursojava.aula34.labs;

public class TesteContador {

    public static void main(String[] args) {

        System.out.println("Inicial: " + Contador.obterValor());

        Contador.incrementar();
        Contador.incrementar();
        System.out.println("Após incrementar: " + Contador.obterValor());

        new Contador();
        new Contador();
        System.out.println("Após criar objetos: " + Contador.obterValor());

        Contador.zerar();
        System.out.println("Após zerar: " + Contador.obterValor());
    }
}
