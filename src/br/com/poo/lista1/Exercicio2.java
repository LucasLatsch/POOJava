//O programa “Hera” irá imprimir a soma das idades de todos os colegas da
//sua equipe (6 pessoas). Pergunte a cada um a idade e não esqueça a sua!
//Depois faça a atribuição direta da expressão em uma variável inteira.

package br.com.poo.lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//inicializando variaveis 
		int somaidade = 0, soma = 0;
		//inicializando o scanner
		Scanner sc = new Scanner(System.in);
		//laço de repetição para a leitura das idades
		for (int i = 0; i < 6; i++) {
			if (i == 5) {
				System.out.print("Escreva a sua idade :");
				somaidade = sc.nextInt();
				soma += somaidade;
				limpa();
			} else {
				limpa();
				System.out.printf("Escreva a idade do amigo %d :", i + 1);
				somaidade = sc.nextInt();
				soma += somaidade;
				limpa();
			}

		}
		//imprimindo a soma das idades
		System.out.printf("A soma das idades é : %d", soma);
		//fechando o scanner
		sc.close();

	}
	//funcão para limpar o terminal 
	public static void limpa() {
		for (int i = 0; i < 5; i++) {
			System.out.println();
		}
	}

}
