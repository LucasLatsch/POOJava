//O programa “Atena” lê uma temperatura em graus celsius, e devolve sua
//equivalência na escala fahrenheit. (Use: F = C * 1, 8 + 32)

package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		//inicializanod a variavel a ser convertida
		int grau;
		//iniciando o scanner
		Scanner sc = new Scanner(System.in);
		//lendo o valor da variavel a ser convertida
		System.out.print("Escreva a temperatura em °C a ser convertido:");
		grau = sc.nextInt();
		//imprimindo o valor com a operação direto no printf
		System.out.printf("%d °C = %f", grau, grau*1.8 + 32);
		//fechando o scanner
		sc.close();
	}

}
