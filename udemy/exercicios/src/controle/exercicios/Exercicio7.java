package controle.exercicios;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		//Crie um programa que recebe 10 valores e ao final
		//imprima o maior número.
		
		
		Scanner entrada = new Scanner(System.in);

		int maiorNumero = 0;
		int numeroInformado = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("entre com um numero");
			numeroInformado = entrada.nextInt();
			
			if(numeroInformado > maiorNumero) {
				maiorNumero = numeroInformado;
			}
		}
		
		System.out.println("O maior numero e = " + maiorNumero);
		entrada.close();
	}
}
