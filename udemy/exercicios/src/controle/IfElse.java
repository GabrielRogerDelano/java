package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog(
				"digite um valor");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("é um numero par");
		
		} else {
			System.out.println("é um numero impar");	
		
		}
		
		
	}
}
