//•1) Declare duas variáveis do tipo int e realize sua soma. Em
//seguida, realize o casting destes dois inteiros para double para
//realizar sua divisão.

package br.com.poo.outralista;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int num1;
		int num2;
		double div;
		Scanner sc= new Scanner(System.in);
		System.out.print("Escreva um numero:");
		num1 = sc.nextInt();
		System.out.print("Escreva outro numero:");
		num2 = sc.nextInt();
		div =(double)num1/(double)num2;
		System.out.printf("A Divisão dos numeros é: %f", div);
		sc.close();
		
	}

}
