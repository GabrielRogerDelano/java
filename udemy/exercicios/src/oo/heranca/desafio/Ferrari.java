package oo.heranca.desafio;

public class Ferrari extends Carro{
	
	Ferrari() {
		this(315);
	}

	Ferrari(int velocidadeMaxima) {
		super(315);
		delta = 15;
	}
}
