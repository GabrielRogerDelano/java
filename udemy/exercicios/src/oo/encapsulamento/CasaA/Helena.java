package oo.encapsulamento.CasaA;

public class Helena {
	
	public String nome = "Helena Borges"; //informcao que esta visivel a todos
	protected int idade = 45; // informacao que so herdeiros podem acessar e os do pacote podem ver
	String endereco = "rua 1 numero 89"; // definicao que vem padrao, so pode ser visivel pelas classes do pacote
	private String segredo = "joga truco"; //private somente a classe tem acesso
	
	public String nome() {
		return nome;
	}
}
