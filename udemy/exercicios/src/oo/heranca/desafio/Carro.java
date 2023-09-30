package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	int delta = 5;	

	Carro(){
		this.VELOCIDADE_MAXIMA = 60;
	}
	
	Carro(int velocidademaxima){
		VELOCIDADE_MAXIMA = velocidademaxima;
	}
	
	void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			this.velocidadeAtual += delta;	
		}
	}
	
	void freiar() {
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
