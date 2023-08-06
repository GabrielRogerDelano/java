package classe.desafio;

public class Pessoa {
	//classe para o desafio
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
		
	}
	
	void comer(Comida comida){
		if(comida != null) {
			System.out.printf("\n%s pesava %.2f\n", nome, peso);
			this.peso += comida.peso;
			System.out.printf("Agora pesa %.2f kg", peso);
			System.out.println("\n---------------------------");
		}
	}
}
