//O sistema “Converter” vai pedir ao usuário um valor do tipo real para
//representar as horas. Após, irá calcular quantos segundos equivalem à hora
//informada. O resultado na tela deve ser do passo a passo da operação.

package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio5 {

	public static final float HORA = 3600;
	public static void main(String[] args) {
		float hora;
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe a hora a ser convertida em segundos:");
		hora = sc.nextFloat();
		//hora = hora*HORA
		System.out.printf("%.2f hora(s) equivale(m) a %.2f segundos!", hora, hora*HORA );
		sc.close();
	}

}
