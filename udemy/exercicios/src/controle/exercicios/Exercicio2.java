package controle.exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		//Criar um programa que receba um número e diga se ele é um 
		//número primo.
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero");
		int numero = entrada.nextInt();
		int NumerosDivisores = 0;
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				NumerosDivisores++;
			}
		}
		
		if(NumerosDivisores == 0) {
			System.out.println("E um numero primo" + NumerosDivisores);
		} else {
			System.out.println("Nao é um numero primo" + NumerosDivisores);
		}
		
		entrada.close();
		
	}
}
