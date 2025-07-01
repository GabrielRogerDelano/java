package oo.composicao;

public class Carro {

	Motor motor = new Motor();
	Portas porta = new Portas();
	
	void acelerar() {
		if (motor.fatorInjecao < 2.6){
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		if (motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desliga() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
	// metodos da porta
	
	void fecharPortas() {
		porta.portasAbertas = false;
	}
	
	boolean portaAberta() {
		return porta.portasAbertas;
	}
}
