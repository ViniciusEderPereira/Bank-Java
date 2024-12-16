package com.bank.model;

public abstract class Conta {
    private String cpf;
    private int numero;
    private double saldo = 0;
    private int numeroAgencia;

    public Conta (String cpf, int numero, double saldo, int numeroAgencia){
        this.cpf = cpf;
        this.numero = numero;
        this.saldo = saldo;
        this.numeroAgencia = numeroAgencia;
    }

    public String cpf() {
        return cpf;
    }

    public void setCliente(String cpf) {
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    // metodo de deposito
    public void depositar(double valor){
        saldo = saldo + valor;

    }



    //metodo de saque
    public void sacar(double valor){
        if(valor >= saldo){
             System.out.println("Não é possível realizar a operação!");
        }else{
            saldo = saldo -valor;

        }

    }
    
    protected abstract double getTaxaManutencao();




}
