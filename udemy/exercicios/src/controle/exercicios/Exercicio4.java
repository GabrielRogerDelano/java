package controle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		
		System.out.println("\n\n Jogo de adivinhacao \n");
		System.out.println("***************************\n");
		System.out.println("- Voce tem 10 chances para acertar\n o numero entre 0 e 100\n\n"); 
		
		Scanner entrada = new Scanner(System.in);
		int NumeroAleatorio;
		int numero = 0;
		int continuar = 1;
		
		do {
			int Tentativas = 10;
			
			while(Tentativas > 0) {
				System.out.println("Digite um valor(" + Tentativas + " chances restantes) : \n");
				
				Random numeroAleatorio = new Random();
				NumeroAleatorio = numeroAleatorio.nextInt(101);
				
				numero = entrada.nextInt();
				
				if(numero > NumeroAleatorio) {
					System.out.println("menos");
					Tentativas--;
				} else if (numero < NumeroAleatorio) {
					System.out.println("mais");
					Tentativas--;
				} else {
					System.out.println("Parabens!!! Voce acertou o numero");
					break;
				}
			}
			
			System.out.println("Suas chances acabaram.\n Para sair do jogo digite 0");
			continuar = entrada.nextInt();
			
		} while (continuar != 0);
		entrada.close();
	}
}
