package com.minhaempresa.exercicios.app;

import com.minhaempresa.exercicios.Conta;
import com.minhaempresa.exercicios.ContaCorrente;
import com.minhaempresa.exercicios.ContaPoupanca;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String [] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente("123456-0");
        contaCorrente1.depositar(100);
        contaCorrente1.sacar(70);

        ContaCorrente contaCorrente2 = new ContaCorrente("923456-0");
        contaCorrente2.depositar(1000);

        ContaPoupanca contaPoupanca1 = new ContaPoupanca("11789-0");
        contaPoupanca1.depositar(5000);

        ContaPoupanca contaPoupanca2 = new ContaPoupanca("18789-0");
        contaPoupanca2.depositar(500);

        List<Conta> contas = new ArrayList<>();

        contas.add(contaCorrente1);
        contas.add(contaCorrente2);
        contas.add(contaPoupanca1);
        contas.add(contaPoupanca2);

        System.out.println();
        System.out.println("Contas: ");
        System.out.println();

        for (Conta listContas : contas){
            listContas.imprimirSaldo();
        }
    }
}
