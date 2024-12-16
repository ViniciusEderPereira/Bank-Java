package com.bank.model;

public class ContaCorrente extends Conta{



    public ContaCorrente(String cpf, int numero, double saldo, int numeroAgencia) {
        super(cpf, numero, saldo, numeroAgencia);
    }

    @Override
    protected double getTaxaManutencao() {
        return 10.0;
    }
}
