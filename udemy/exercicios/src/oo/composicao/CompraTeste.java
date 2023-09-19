package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Joao pedro";
		
		compra1.itens.add(new Item("lapis", 10, 1.20));
		compra1.itens.add(new Item("postIt", 3, 2.30));
		compra1.itens.add(new Item("estojo", 2, 9.98));
		
		System.out.println(compra1.itens.size());
		System.out.println("O total da compra é : \nR$ " + compra1.ObterValorTotal());
	}
}
