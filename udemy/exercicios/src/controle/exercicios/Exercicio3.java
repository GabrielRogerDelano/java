package controle.exercicios;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		//Criar um programa que receba um número e diga se ele é um 
		//número primo. Usando Switch
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("digite um numero");
		int numero = entrada.nextInt();
		int contador = 0;
		
		for(int i = 2; i < numero; i ++) {
			if(numero % i == 0) {
				contador++;
			}
		}
		
		switch(contador) {
		case 0:
			System.out.println("o numero " + numero + " e primo");
			break;
		default:
			System.out.println("o numero " + numero + " nao e primo");
		}
		
		entrada.close();
	}
}
