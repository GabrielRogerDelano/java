package classe;

public class Produto {
	
	//objetos da classe
	String nome;
	double preco;
	static double desconto = 0.50;
	
	//construtor
	Produto(String nomeInicial, double precoInicial){
		this.nome = nomeInicial;
		this.preco = precoInicial;
	}
	
	//metodo de desconto
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
}
