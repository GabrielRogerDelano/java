package arrays;

//import java.util.Arrays;
import java.util.Scanner;

public class Desafio01 {
	
	public static void main(String[] args) {
		/* Recebe uma quandidade de notas que vai contar, e calcule 
		 * a media das notas 
		*/
		
		//inicia a entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		//recebe o quantas notas vai receber
		System.out.println("Quantas notas quer contar : ");
		int qtdeNotas = entrada.nextInt();
		
		//inicia o array
		double [] notas = new double[qtdeNotas];

		//mapeia as notas no array
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %s nota : \n", i+1);
			notas[i] = entrada.nextDouble();
		}
		
		//encerra o scanner
		entrada.close();
		
		//System.out.println(Arrays.toString(notas));
		//percorre o array e adiciona cada elemento a soma
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		
		//printa o resultado
		System.out.println("A media das notas é : " + soma / notas.length);
		
	}
}
