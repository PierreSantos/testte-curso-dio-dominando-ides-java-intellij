package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtracao = subtracao(a, b);
        int divisao = divisao(a, b);
        int multiplicacao = multiplicacao(a, b);

        System.out.println("soma: " + somar);
        System.out.println("sub: " + subtracao);
        System.out.println("div: " + divisao);
        System.out.println("mult: " + multiplicacao);
    }

    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subtracao(int a, int b) {
        return a - b;
    }
    public static int divisao(int a, int b) {
        return a / b;
    }
    public static int multiplicacao(int a, int b) {
        return a * b;
    }
}
