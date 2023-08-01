package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	// Criar um programa que receba um número e verifique se 
	//ele está entre 0 e 10 e é par;
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero");
		int valor = entrada.nextInt();
		
		if (valor <= 10 && valor >=0) {
			if (valor % 2 == 0) {
				System.out.println(valor + " é par");
			} else {
				System.out.println(valor + " é impar");
			}
			
		} else {
			System.out.println("O numero " + valor + " não está entre 0 e 10.");
		}

		entrada.close();
	}
}
