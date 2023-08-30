package br.com.poo.outralista;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int n1;
		int n2;
		int soma;
		Scanner sc = new Scanner(System.in);
		limpa();
		System.out.print("Informe um numero inteiro: ");
		n1 = sc.nextInt();  
		limpa();
		//leitura do segundo numero 
		System.out.print("Informe outro numero inteiro: ");
		n2 = sc.nextInt();
		limpa();
		soma = n1 + n2;
		System.out.printf("A soma dos numeros e igual a %d", soma);
		sc.close();
	}
	public static void limpa() {
		for(int i=0; i<10; i++) {
			System.out.println();
		}
	}

}
