package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Paulo", "Mussi", -56);
		p1.setIdade(40);
		
		System.out.println(p1.getIdade());
		System.out.println(p1.getNomeCompleto());
	}
}
