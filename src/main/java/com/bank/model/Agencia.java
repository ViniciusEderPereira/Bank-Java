package com.bank.model;

public class Agencia {


    private int numeroAgencia;
    private String nome;
    private String estado;

    public Agencia(int numeroAgencia, String nome, String estado) {
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.estado = estado;
    }


    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
