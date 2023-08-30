package br.com.poo.outralista;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		String nome;
		String sobrenome;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		nome = sc.next();
		System.out.print("Agora seu sobrenome:");
		sobrenome = sc.next();
		limpa();
		//nao aceita virgula
		System.out.println("Seja bem vindo ao mundo da programação " + nome + " " + sobrenome);
		System.out.printf("\n\nSeja bem vindo ao mundo da programação %s %s \n\n", nome, sobrenome);
		sc.close();
		
		
		System.out.print("1 - Ola\t");
		System.out.print("Mundo");
		System.out.println();
		
		System.out.print("2 - Ola\n");
		System.out.print("Mundo");
		System.out.println();
		
		System.out.print("3 - Ola\\");
		System.out.print("Mundo");
		System.out.println();
		
		System.out.print("4 - Ola\'");
		System.out.print("Mundo");
		System.out.println();
		
		System.out.print("5 - Ola\"Mundo");
		//System.out.print("Mundo");
	}
	public static void limpa() {
		for(int i=0; i<10; i++) {
			System.out.println();
		}
	}

}
