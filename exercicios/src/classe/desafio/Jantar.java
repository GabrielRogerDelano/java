package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		Pessoa joao = new Pessoa("Joao", 60);
		
		Comida Pizza = new Comida("Pizza", 0.5);
		Comida Arroz = new Comida("Arroz", 0.15);
		
		joao.comer(Pizza);
		joao.comer(Arroz);
	}
}
