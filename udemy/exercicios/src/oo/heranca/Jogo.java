package oo.heranca;

public class Jogo {
	public static void main(String[] args) {
		
		Monstro j1= new Monstro();
		j1.x = 0;
		j1.y = 0;
		
		Heroi j2 = new Heroi();
		j2.x = -2;
		j2.y = 3;
		
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.OESTE);
		j1.andar(Direcao.NORTE);

		System.out.println(j2.vida);
		j1.atacar(j2);
		System.out.println(j2.vida);
		
		System.out.println(j1.x);
		System.out.println(j1.y);
	
	}
}
