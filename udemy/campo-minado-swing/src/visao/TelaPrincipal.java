package visao;

import javax.swing.JFrame;

import modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{
	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 30);
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TelaPrincipal();
	}
}
