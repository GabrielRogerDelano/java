package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		//recebe notas,soma uma variavel,conta quantas tem e quando digitar -1 pare
		//alertar quando tiver notas invalidas
		
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		
		while(nota != -1) {
			
			System.out.println("Digite uma nota");
			nota = entrada.nextDouble();

			if(nota<=10 && nota>=0) {
				total += nota;
				quantidadeDeNotas++;
				
			}else if(nota != -1) {
				System.out.println("nota invalida");
			}
		}
		
		double media = total / quantidadeDeNotas;
		System.out.println("Meida é = " + media);
		
		entrada.close();
	}
}
