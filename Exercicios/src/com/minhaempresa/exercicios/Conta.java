package com.minhaempresa.exercicios;
public abstract class Conta {
    protected String identificadorConta;
    protected double saldo;
    protected String tipo;
    protected int verificarTipo;
    public void depositar(double valor) {
        saldo+=valor;
    }
    public void sacar (double valor) {
        if (valor > saldo){
            System.out.println("Você não tem saldo suficiente. Saldo atual: "+ this.saldo);
            return;
        }
        saldo -= valor;
    }

//    public void testeImprimir() {
//        if (verificarTipo == 0) {
//            imprimirSaldo();
////            System.out.printf("Sua conta: %s %nSeu saldo: %.2f %nTipo da conta: %s %n", identificadorConta, saldo, tipo);
//            System.out.println();
//        }
//        else {
//            imprimirSaldo();
////            System.out.printf("Sua conta: %s %nSeu saldo: %.2f %nTipo da conta: %s %nSeu rendimento: %.2f%n", identificadorConta, saldo, tipo, rendimentos());
//            System.out.println();
//        }
//    }
    public void imprimirSaldo() {

    }
//    @Override
//    public String toString() {
//        return "ID da Conta: " + identificadorConta + ", saldo: " + saldo + ", tipo: " + tipo;
//    }
}
