//Crie o programa “Zeus”, que após ler dois números inteiros
//apresenta as operações de soma, subtração, multiplicação e divisão com
//eles.

package br.com.poo.lista1;					//FEITO

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//inicializando as variaveis
		int soma=0;
		int sub=0;
		int mult=0; 
		int n1;
		int n2;
		float div=0;
		//inicializando o scanner
		Scanner sc = new Scanner(System.in);
		//leitura do primeiro numero 
		System.out.print("Informe um numero inteiro: ");
		n1 = sc.nextInt();
		limpa();
		//leitura do segundo numero 
		System.out.print("Informe outro numero inteiro: ");
		n2 = sc.nextInt();
		limpa();
		//declarando os valores das operaçoes 
		soma = n1 + n2;
		sub = n1 - n2;
		mult = n1 * n2;
		//imprimindo os resultados 
		System.out.printf("A soma é : %d", soma);
		System.out.println();
		System.out.printf("A subtração é : %d", sub);
		System.out.println();
		System.out.printf("A multiplicação é : %d", mult);
		System.out.println();
		//tratamento de erro para n2=0
		if(n2 == 0) {
			System.out.println("Divisão por zero inexistente!!");
		}
		else {
			div = n1/n2;
			System.out.printf("A divisão é : %f", div);
			System.out.println();
		}
		//finalizando o scanner
		sc.close();
	}
	public static void limpa() {
		for(int i=0; i<5; i++) {
			System.out.println();
		}
	}
}
