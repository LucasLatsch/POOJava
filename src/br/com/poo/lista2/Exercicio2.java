//Escrever o programa “Minha Idade”. O programa deve receber sua data de
//nascimento e calcular sua idade. Após, escreva a idade na tela.

package br.com.poo.lista2;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int dia;
		int ano;
		int mes;
		int idade = 0;
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		
		System.out.print("Informe seu dia de nascimento:");
		dia = sc.nextInt();
		limpa();
		
		System.out.print("Informe seu mes de nascimento:");
		mes = sc.nextInt();
		limpa();
		
		System.out.print("Informe seu ano de nascimento:");
		ano = sc.nextInt();
		limpa();
		
		if(mes >= c.get(Calendar.MONTH)) {
			if(dia >= c.get(Calendar.DAY_OF_MONTH)) {
				idade = c.get(Calendar.YEAR) - ano;
			}else {
				idade = c.get(Calendar.YEAR) - ano - 1;
			}
		}else {
			idade = c.get(Calendar.YEAR) - ano - 1;
		}
		
		sc.close();
		System.out.printf("Sua idade é: %d", idade);
	}
	public static void limpa() {
		for(int i=0; i<5; i++) {
			System.out.println();
		}
	}
}
