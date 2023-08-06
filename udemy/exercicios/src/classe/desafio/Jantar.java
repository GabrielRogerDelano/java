package classe.desafio;

public class Jantar {
	//classe para o desafio
	public static void main(String[] args) {
		Pessoa joao = new Pessoa("Joao", 60);
		Pessoa maria = new Pessoa("Maria", 46);
		
		Comida Strogonoff = new Comida("Strogonoff", 0.20);
		Comida Arroz = new Comida("Arroz", 0.70);
		Comida sucoMilagroso = new Comida("sucoMilagroso", -10);
		
		joao.comer(Strogonoff);
		joao.comer(sucoMilagroso);
		joao.comer(Strogonoff);
		joao.comer(Strogonoff);
		joao.comer(Strogonoff);
		
		maria.comer(Strogonoff);
		maria.comer(Arroz);

	}
	
}
