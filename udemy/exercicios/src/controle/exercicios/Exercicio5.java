package controle.exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		//Criar um programa que enquanto estiver recebendo números
		//positivos, imprime no console a soma dos números 
		//inseridos, caso receba um número negativo, encerre 
		//programa. Tente utilizar a estrutura do while.
		
		System.out.println("Soma Positiva\n\n");		
		System.out.println("digite qualquer numero negativo para parar");		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int soma = 0;
		
		while (numero >= 0) {
			System.out.println("Digite um numero");
			numero = entrada.nextInt();
			
			if(numero >= 0) {
				soma+=numero;
			}
		} 
		
		System.out.println("A soma e = " + soma);

		entrada.close();
		
	}
}
