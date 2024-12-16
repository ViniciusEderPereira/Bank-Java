package com.bank.model;

public class Funcionario extends Pessoa {


    private int numeroAgencia;
    private Cargo cargo;


    public Funcionario(String name, String cpf, String email, int numeroAgencia, Cargo cargo) {

        super(name, cpf, email);
        this.numeroAgencia = numeroAgencia;
        this.cargo = cargo;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
