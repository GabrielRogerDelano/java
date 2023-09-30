package oo.heranca;

public class Monstro extends Jogador{
	
	Monstro(){
		super( 0, 0);
	}
	
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 1 && deltaY == 0 ) {
			oponente.vida -= 30;
			return true;
		} else if(deltaY == 0 && deltaY == 1) {
			oponente.vida -= 30;
			return true;
		} else { 
			return false;
		}
	}
}
