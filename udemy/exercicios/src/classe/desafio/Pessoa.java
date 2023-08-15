package classe.desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
		
	}
	
	void comer(Comida comida){
		if(comida != null) {
			System.out.println( nome + " pesava " + peso  + "Kg");
			this.peso += comida.peso;
			System.out.println("Agora pesa " + peso +"kg");
			System.out.println("------------------------");
		}
	}
}
