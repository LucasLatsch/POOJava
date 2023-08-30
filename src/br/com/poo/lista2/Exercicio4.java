//O programa "Triângulo" irá pedir três valores de ângulos e irá classificar os
//triângulos em Acutângulo, Obtusângulo ou Retângulo (caso não se recorde
//das classificações, pesquise por “classificação de triângulo em relação aos
//ângulos”). Depois disso, escreva os ângulos e a classificação do triângulo.


package br.com.poo.lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int ang1;
		int ang2;
		int ang3;
		int soma=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("Digite o primeiro angulo do triangulo:");
			ang1 = sc.nextInt();
			System.out.printf("Digite o segundo angulo do triangulo:");
			ang2 = sc.nextInt();
			System.out.printf("Digite o terceiro angulo do triangulo:");
			ang3 = sc.nextInt();
			limpa();
			soma = ang1 + ang2 + ang3;
			if(soma != 180) {
				System.out.println("Os angulos nao correspondem a um triangulo! Tente novamente.");
			}else if( ang1 ==0 || ang2 == 0 || ang3 ==0) {
				System.out.println("Os angulos nao correspondem a um triangulo! Tente novamente.");
			}
			limpa();
		}while(soma != 180);
		if(ang1 < 90 && ang2 <90 && ang3 < 90) {
			System.out.println("Triangulo Acutangulo!");
		}
		if(ang1 == 90 || ang2 == 90 || ang3 == 90) {
			System.out.println("Triangulo Retangulo!");
		}else if(ang1 > 90 || ang2 > 90 || ang3 > 90){
			System.out.println("Triangulo Obtusangulo!");

		}
		sc.close();
	}
	public static void limpa() {
		for(int i =0; i<10; i++) {
			System.out.println();			
		}
	}

}
