package com.minhaempresa.exercicios;

public class ReferenciaOuValor {
    public static void main(String [] args) {
    //int valor = 1;
    //meuMetodoPrimitivo(valor);
    //System.out.println(valor);

        System.out.println();

        // OBJETO DO TIPO PESSOA
        Pessoa pessoa = new Pessoa("Marcos", 30);
        //meuMetodoObjetoComGetSet(pessoa);
        //System.out.println(pessoa);

        System.out.println();
        meuMetodoObjetoSemGetSet(pessoa);
        System.out.println(pessoa);
    }
    //passagem de parámetro por valor
    //private static void meuMetodoPrimitivo(int parametro) {
    //parametro = 38;
    //}

    //PASSAGEM DE PARÁMETRO POR VALOR
    private static void meuMetodoObjetoSemGetSet(Pessoa parametro) {
        parametro.Nome = "Willyan";          // SEM GET, SET
        parametro.Idade = 22;

        //parametro = new Pessoa("Fernando", 5); //NÃO É POSSIVEL CRIAR UM NOVO  OBJETO SOMENTE
        //ALTERA OS VALORES
    }

//    private static void meuMetodoObjetoComGetSet(Pessoa parametro) {
//        parametro.getNome("CLeiton");       // COM GET, SET
//        parametro.getIdade(40);
//    }

}
