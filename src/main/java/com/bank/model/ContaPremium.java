package com.bank.model;

public class ContaPremium extends Conta {




    public ContaPremium(String cpf, int numero, double saldo, int numeroAgencia) {
        super(cpf, numero, saldo, numeroAgencia);
    }

    @Override
    protected double getTaxaManutencao() {
        return 50.0;
    }
}
