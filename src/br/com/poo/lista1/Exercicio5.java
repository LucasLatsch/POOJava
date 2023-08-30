//O programa “Apolo” escreve na tela o resultado das expressões abaixo:
//a. 2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66
//b. 2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9

package br.com.poo.lista1;

public class Exercicio5 {

	public static void main(String[] args) {
		System.out.println("Valor das expressões:");
		System.out.printf("Expressão A: %d", (2 + 3 - 5 * 8 - 4 + 354 - 521 + 7 * 66));
		System.out.println();
		System.out.printf("Epressão B: %d", (2 + 7 * (14 - 21) + 28 * 3 * 42 + 740 - (156 + 4 + 40) * 9));
	}

}
