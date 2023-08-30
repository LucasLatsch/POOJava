package br.com.poo.lista3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int vetor[] = new int[20];
		int a=0;
		int b=0;
		int c=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<20; i++) {
			System.out.print("Escreva um numero:");
			vetor[i] = sc.nextInt();		
		}
		for(int i=0; i<20; i++) {
			if(vetor[i] >= 0 & vetor[i] <= 100) {
				a++;
			}
			if(vetor[i] > 100 & vetor[i] <= 200) {
				b++;
			}
			if(vetor[i] > 200) {
				c++;
			}
		}
		limpa();
		System.out.printf("Entre 0 e 100 temos %d numero(s)", a);
		System.out.printf("\nEntre 101 e 200 temos %d numero(s)", b);
		System.out.printf("\nMaior que 200 temos %d numero(s)", c);

		sc.close();
	}
	public static void limpa() {
		for(int i=0; i<10; i++) {
			System.out.println();
		}
	}

}
