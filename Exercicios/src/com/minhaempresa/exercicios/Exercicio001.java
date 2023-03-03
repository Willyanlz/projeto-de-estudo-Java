package com.minhaempresa.exercicios;

import java.util.Scanner;
import java.lang.Math;
public class Exercicio001 {
    public static void main (String [] args) {
        Scanner v1in = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int v1 = v1in.nextInt();

        Scanner v2in = new Scanner(System.in);
        System.out.println("Insira outro valor: ");
        int v2 = v2in.nextInt();

        System.out.printf("A soma dos valores é: %d %n", v1 + v2);
        System.out.printf("A raiz quadrada de %d é: %.1f",v1 + v2, Math.sqrt(v1+v2));
    }
}
