package oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Roger");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("lapis", 1, 10);
		compra1.adicionarItem("borracha", 1, 15);

		Compra compra2 = new Compra();
		compra2.adicionarItem(new Produto("Caderno", 15.00), 3);
		compra2.adicionarItem("borracha", 1, 15);
		
		cliente1.adicionarCompras(compra2);
		cliente1.adicionarCompras(compra1);
		
		System.out.println(cliente1.obterValorTotal());
	}
}
