package visao;

import modelo.Tabuleiro;

public class Temp {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(2,2,4);
		
		
		tabuleiro.registrarObservador(e -> {
			if(e.isGanhou()) {
				System.out.println("Ganhou!!");
			}else {
				System.out.println("Perdeu");
			}
		});
		
		
		tabuleiro.AlterarMarcacao(0,0);
		tabuleiro.AlterarMarcacao(0,1);
		tabuleiro.AlterarMarcacao(1,0);
		tabuleiro.AlterarMarcacao(1,1);
	}
}
