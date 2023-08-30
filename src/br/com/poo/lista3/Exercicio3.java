package br.com.poo.lista3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int num;
		int soma=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Escreva um numero:");
			num = sc.nextInt();
			if(num >= 0) {
				soma += num;
			}
		}while(num >= 0);
		System.out.println("Encerrando programa...\nA soma é " + soma);

		
		
		
		
		sc.close();
	}

}
