package oo.heranca.desafio;

import oo.heranca.teste.Carro;

public class Ferrari extends Carro implements Esportivo{
	
	public Ferrari() {
		this(300);
	}
	
	public void ligarTurbo() {
		delta = 30;
	}

	public void desligarTurbo() {
		delta = 15;
	}
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
}
