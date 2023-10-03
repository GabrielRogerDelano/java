package oo.encapsulamento;

public class Pessoa {
	private int idade;
	String nome;
	String sobreNome;
	
	public Pessoa(String nome, String sobreNome, int idade) {
		setNome(nome);
		setSobreNome(sobreNome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobreNome();
	}

	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;			
		}
	}
}
