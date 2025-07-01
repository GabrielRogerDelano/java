package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o dia da semana");
		String dia = entrada.next();
		
		if( dia.equalsIgnoreCase("domingo")) {
			System.out.println("1");
			
		} else if( dia.equalsIgnoreCase("segunda") ) {
			System.out.println("2");
			
		} else if( dia.equalsIgnoreCase("terca")
				|| dia.equalsIgnoreCase("terça")) {
			System.out.println("3");
			
		} else if( dia.equalsIgnoreCase("quarta")) {
			System.out.println("4");
			
		} else if( dia.equalsIgnoreCase("quinta")) {
			System.out.println("5");
			
		} else if( dia.equalsIgnoreCase("sexta")) {
			System.out.println("6");
			
		} else if( dia.equalsIgnoreCase("sabado")
				|| dia.equalsIgnoreCase("Sábado")) {
			System.out.println("7");
			
		}
		
		entrada.close();
	}
}
