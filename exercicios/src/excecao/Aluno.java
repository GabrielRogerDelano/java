package excecao;

public class Aluno {
	public String nome;
	public Double nota;
	
	public Aluno(String nome, Double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public String toString() {
		return nome + " tem nota " + nota;
	}
}
