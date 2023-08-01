package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe a media");
		double media = entrada.nextDouble();
		
		boolean criterioAtingido = media < 7 && media >= 4.5;
		if( media >= 7) {
			System.out.println("Aluno aprovado");
			System.out.println("Parabéns");
		}
		
		if (criterioAtingido) {
			System.out.println("Aluno esta de recuperacao");
		}
		
		
		entrada.close();
	}
}
