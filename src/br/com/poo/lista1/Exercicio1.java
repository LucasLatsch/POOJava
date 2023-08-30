//pacote da aplicacao
package br.com.poo.lista1;

//lista de bibliotecas
import java.util.Scanner;

//funcao 'programa' do portugol
public class Exercicio1 {

	// funcao inicio do portugol
	public static void main(String[] args) {
		String nome;
		String sobrenome;

		//iniciando scanner
		Scanner sc = new Scanner(System.in);

		//escrever algo no terminal
		System.out.print("Por favor, informe seu nome: ");

		// funcao leia
		nome = sc.next();

		//utilizando o laco para limpar o console 
		limpa();
		System.out.print("Agora informe o sobrenome: ");
		sobrenome = sc.next();

		// fechando o scanner apos a utilizacao
		sc.close();

		limpa();

		System.out.print("Seja bem-vindo(a) " + nome + " " + sobrenome);
	}

	public static void limpa() {
		for (int i = 0; i < 3; i++) {
			System.out.println();
		}
	}
}
