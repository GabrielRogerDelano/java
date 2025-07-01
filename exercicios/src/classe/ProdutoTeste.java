package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		//instancia (criando com a classe desejada)
		Produto p1 = new Produto("monitor 21\" polegadas", 549.99);

		//instancia (deixando com o compilador pra escolher o tipo)
		var p2 = new Produto("tomada 4 pinos" ,49.99);	
		
		double precoTotal = p1.preco + p2.preco;
		double desconto1 = p1.precoComDesconto();
		double desconto2 = p2.precoComDesconto();
		
		
		double TotalComDesconto = desconto1 + desconto2;
		System.out.println(p1.nome);
		System.out.println(p2.nome);
	
		
		System.out.println("Total = R$" + precoTotal);
		System.out.printf("\nPagando avista sai por R$%.2f\n" ,TotalComDesconto);
		System.out.printf("%s por %.2f\n + ", p1.nome ,desconto1);
		System.out.printf("%s por %.2f", p2.nome ,desconto2);
		
	}
}
