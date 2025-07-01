package oo.composicao.desafio;

public class Sisitema {

	public static void main(String[] args) {
	
		Compra compra1 = new Compra();
		compra1.adicionarItem("caneta", 10, 120);
		compra1.adicionarItem(new Produto("notebook", 2000.00), 2);
	
		Compra compra2 = new Compra();
		compra2.adicionarItem("caneta", 10, 120);
		compra2.adicionarItem(new Produto("notebook", 2000.00), 2);
		
		Cliente cliente = new Cliente("joao");

		cliente.compras.add(compra1);
		cliente.adicionarCompras(compra2);
		
		System.out.println(cliente.obterValorTotal());
	
	}
}
