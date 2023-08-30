//O sistema “Múltiplos de 6” irá pedir ao usuário um intervalo, maior que 100,
//de valores inteiros. Após, irá somar os três primeiros com os três últimos
//múltiplos de 6 desse intervalo. Ao final, imprime os múltiplos e o resultado
//da soma.
//tentar fazer com um unico contator subindo e descendo

package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int a;
		int cont = 0;
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Escreva o final do intervalo desejado:");
		a = sc.nextInt();
		limpa();
		System.out.println("Os primeiros e os ultimos numeros são: ");
		
		for(int i=100;i<=a;i++ ) {
			if(i%6==0 && cont <=2) {
				System.out.print(" " + i);
				soma+=i;
				cont++;
			}
		}
		for(int i=a;i>=100;i-- ) {
			if(i%6==0 && cont >=1) {
				System.out.print(" " + i);
				soma+=i;
				cont--;
			}
		}
		System.out.println("\n\nA soma deles é: " + soma);
		
		
		
		sc.close();
	}
	public static void limpa() {
		for(int i=0; i<10; i++) {
			System.out.println();
		}
	}

}
