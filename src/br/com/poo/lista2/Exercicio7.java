//O programa “Estudo da Madrugada” irá calcular a porcentagem de
//estudantes que estudam durante a madrugada. Para isso, o assistente
//administrativo irá interagir com o programa. Primeiro ele deve perguntar
//ao assistente quantos estudantes têm na turma. Após, com base em
//estudos anteriores, o assistente verificou que, na primeira disciplina da
//residência, 35% dos estudantes estudam de madrugada e na segunda
//disciplina, esse valor sobe 30%. Ao considerar a média das duas disciplinas e
//a quantidade de estudantes da turma, o programa deve informar ao
//assistente quantos estudantes, em média, estudam de madrugada nas
//duas primeiras disciplinas.


package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int t1;
		int t2;
		float total;
		float soma;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite q auntidade de alunos da primeira turma:");
		t1 = sc.nextInt();
		System.out.print("Digite a quantidade de alunos da segunda turma:");
		t2 = sc.nextInt();
		soma = t1 + t2;
		t1 = (t1*35)/100;
		t2 = (t2*65)/100;
		total = (100*(t1 + t2))/soma;
		System.out.printf("O total de alunos que estudam durante a madrugada e %.2f", total);
		
		
		sc.close();
	}

}
