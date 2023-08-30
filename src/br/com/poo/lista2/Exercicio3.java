//O programa "Estoque" irá solicitar que o cliente acesse um menu
//e escolha entre as opções (Listar Produtos com estoque; Listar Produtos
//sem estoque; Sair). Para gerar as listas será preciso simular um banco
//(vetores ou matrizes). Para cada opção, exibe a lista correspondente. Para a
//opção Sair, perguntar se deseja, realmente, sair e encerra o programa se a
//resposta for sim.

package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int op;
		String [][]matriz = { {"Pão", "5"}, {"Sal", "0"}, {"Açucar", "0"}, {"Café", "2"} };
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("1-Mostrar sem estoque\n2-Mostrar com estoque\n3-Sair\n");
			System.out.print("Escolha a opção desejada:");
			op = sc.nextInt();
			switch(op) {
				case 1:
					limpa();
					for(int i=0; i<4; i++) {
						if(matriz[i][1] == "0") {
							System.out.printf("%s\t%s", matriz[i][0], matriz[i][1]);
							System.out.println();
						}
					}
					break;
			
				case 2:
					limpa();
					for(int i=0; i<4; i++) {
						if(matriz[i][1] != "0") {
							System.out.printf("%s\t%s", matriz[i][0], matriz[i][1]);
							System.out.println();
						}
					}
					break;
			
				case 3:
					limpa();
					System.out.println("Saindo do programa.....");
					break;
			
				default:
					limpa();
					System.out.println("Opção invalida, por favor tente novamente!");
					break;
			}
		}while(op != 3);
		sc.close();
	}
	public static void limpa() {
		for(int i=0; i<10; i++) {
			System.out.println();
		}
	}

}
