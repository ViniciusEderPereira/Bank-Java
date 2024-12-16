package com.bank.model;

public class ContaPoupanca extends Conta {


    private static final double rendimentoMensal = 0.8;

    public ContaPoupanca(String cpf, int numero, double saldo, int numeroAgencia) {
        super(cpf, numero, saldo, numeroAgencia);
    }

    @Override
    protected double getTaxaManutencao() {
        return 1.0;
    }
}
