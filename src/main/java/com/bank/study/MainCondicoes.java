package com.bank.study;

public class MainCondicoes {

	public static void main(String[] args) {
		int idade = 15;
		
		if(idade >= 18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");
		}
		
		switch(idade) {
			case 17: 
				System.out.println("tem 15 anos");
				break;
			case 18:
				System.out.println("tem 18 anos");
				break;
			default:
				System.out.println("Nenhuma das condições");
		}
		
		String texto = idade >= 18 ? "Maior de idade": "Menor de idade";
		System.out.println(texto);
		System.out.println(idade >= 18 ? "Maior de idade": "Menor de idade");

	}

}
