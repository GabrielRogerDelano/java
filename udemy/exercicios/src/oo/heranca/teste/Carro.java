package oo.heranca.teste;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	protected int delta = 5;	

	protected Carro(){
		this.VELOCIDADE_MAXIMA = 60;
	}
	
	protected Carro(int velocidademaxima){
		VELOCIDADE_MAXIMA = velocidademaxima;
	}
	
	public void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			this.velocidadeAtual += delta;	
		}
	}
	
	public void freiar() {
		if (velocidadeAtual >= 5) {
			this.velocidadeAtual -= 5;	
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "A velocidade atual do carro é " + velocidadeAtual+ "Km/h" ;
	}
}
