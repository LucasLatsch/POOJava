package br.com.poo.lista3;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		String nome;
		String nomemenor = "";
		int idade;
		int menoridade = 100;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.print("Escreva o seu primeiro nome:");
			nome = sc.next();
			System.out.print("Escreva a sua idade:");
			idade = sc.nextInt();
			if(idade < menoridade) {
				menoridade = idade;
				nomemenor = nome;
			}
			
		}
		System.out.printf("A pessoa com menor idade é %s e tem %d anos", nomemenor, menoridade);
		sc.close();
	}

}
