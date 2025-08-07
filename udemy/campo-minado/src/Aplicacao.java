import modelo.Tabuleiro;

public class Aplicacao {
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(5,5,5);
		
		tabuleiro.AlterarMarcacao(2,3);
		tabuleiro.AlterarMarcacao(1,2);
		tabuleiro.abrir(0,0);
		
		System.out.println(tabuleiro);
		
	}
}
