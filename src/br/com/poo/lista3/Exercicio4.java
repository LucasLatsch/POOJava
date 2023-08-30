package br.com.poo.lista3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int num;
		int cont=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<20; i++) {
			System.out.print("Escreva um numero:");
			num = sc.nextInt();
			if(num % 2 == 0) {
				cont++;
			}
		}
		System.out.println("A quantidade de numeros pares é " + cont);
		
		
		sc.close();
	}

}
