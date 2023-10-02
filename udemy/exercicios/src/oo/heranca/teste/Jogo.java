package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi();
		heroi.x = 11;
		heroi.y = 10;
		
		System.out.println("o monstro tem => " + monstro.vida);
		System.out.println("o heroi tem => " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("o monstro tem => " + monstro.vida);
		System.out.println("o heroi tem => " + heroi.vida);
	}
}
