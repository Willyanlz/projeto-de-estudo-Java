package com.minhaempresa.exercicios;
public class ContaCorrente extends Conta {
        public ContaCorrente(String identificadorConta) {
                super.identificadorConta = identificadorConta;
                super.tipo = "Conta corrente";
                super.verificarTipo = 0;
        }
        @Override
        public void imprimirSaldo() {
                System.out.printf("Sua conta: %s %nSeu saldo: %.2f %nTipo da conta: %s %n", super.identificadorConta, super.saldo, super.tipo);
                System.out.println();
        }
}
