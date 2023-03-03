package com.minhaempresa.exercicios;

import java.util.Scanner;
public class Exercicio002 {
    public static void main (String [] args) {
        Scanner v1in = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        double v1 = v1in.nextDouble();

        Scanner v2in = new Scanner(System.in);
        System.out.println("Insira o segundo valor: ");
        double v2 = v2in.nextDouble();

        Scanner v3in = new Scanner(System.in);
        System.out.println("Insira o terceiro valor: ");
        double v3 = v3in.nextDouble();

        Scanner v4in = new Scanner(System.in);
        System.out.println("Insira o quarto valor: ");
        double v4 = v4in.nextDouble();

        double media = (v1+v2+v3+v4) / 4;

        if (media>=7){
            System.out.printf("Parabéns! Você aprovado com média: %.2f", media);
        } else {
            System.out.printf("Você foi reprovado com média: %.2f", media);
        }

        System.out.println();

        int a = 10;

        for (int i=1; i<=a; i++){
            System.out.println("Valor de i é: " + i);
        }
    }
}
