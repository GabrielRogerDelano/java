package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	boolean ligarTurbo;
	boolean ligarAr;
	
	public Ferrari() {
		this(300);
	}
	
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	public void ligarAr() {
		ligarAr = true;
	}
	
	public void desligarAr() {
		ligarAr = false;
	}
	
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}
}
