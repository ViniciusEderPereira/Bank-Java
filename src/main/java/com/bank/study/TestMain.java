package com.bank.study;

import com.bank.model.Conta;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		PessoaStaticFinal p1 = new PessoaStaticFinal();
		p1.nome = "Antonio";
		PessoaStaticFinal p2 = new PessoaStaticFinal();
		p2.nome = "Vinicius";
		
		PessoaStaticFinal p3 = new PessoaStaticFinal();
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p3.nome);
		System.out.println(PessoaStaticFinal.nome);
		System.out.println(PessoaStaticFinal.sobreNome);
		
	}


}
