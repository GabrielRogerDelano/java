package excecao;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {

		//quand usa um bloco de try catch e quer que uma acao sempre aconteca no final adicione um finally 
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Digite um numero para dividir por 7");
			System.out.println("Resultado é : " +(7 / scan.nextInt()));
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("finally 01");
		}
		
		try {
			System.out.println("Digite um numero para dividir por 7");
			System.out.println("Resultado é : " +(7 / scan.nextInt()));
		} finally {
			System.out.println("finally 02");
			scan.close();
		}
		
		System.out.println("Fim!!!");
	}
}
