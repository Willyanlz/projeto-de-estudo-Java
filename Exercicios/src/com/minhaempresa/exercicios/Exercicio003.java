package com.minhaempresa.exercicios;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Exercicio003 {
    public static void main (String [] args) {
        Scanner entradaValor = new Scanner(System.in);
        System.out.println("Insira um numero inteiro: ");
        int valor = entradaValor.nextInt();

        int parImpar = valor % 2;

        if (parImpar == 0) {
            for (int i = 0; i < 4; i++) {
                System.out.printf("O número inserido '%d' é par%n", valor);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.printf("O número inserido '%d' é impar%n", valor);
            }
        }
        System.out.println();
        System.out.println("Insira uma frase: ");
        entradaValor.nextLine();
        String frase = entradaValor.nextLine();
        StringBuilder fraseInvertida = new StringBuilder(frase);
        System.out.println(fraseInvertida.reverse().toString().toUpperCase());
        entradaValor.close();
        System.out.println();

        System.out.println("Data atual: ");
        LocalDateTime localDateTime = LocalDateTime.now();
        String strLocalDateTime = localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(strLocalDateTime);
    }
}
