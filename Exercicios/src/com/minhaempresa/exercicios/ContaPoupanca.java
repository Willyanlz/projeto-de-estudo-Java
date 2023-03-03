package com.minhaempresa.exercicios;
public class ContaPoupanca extends Conta {
    public ContaPoupanca(String identificadorConta) {
        super.identificadorConta = identificadorConta;
        this.tipo = "Conta poupança";
        super.verificarTipo = 1;
    }
    public double rendimentos() {
        return super.saldo = saldo * 0.01; // ou 1% saldo = 1/100 * saldo
    }
    @Override
    public void imprimirSaldo() {
        System.out.printf("Sua conta: %s %nSeu saldo: %.2f %nTipo da conta: %s %nSeu rendimento: %.2f%n", super.identificadorConta, super.saldo, super.tipo, rendimentos());
        System.out.println();
    }
}