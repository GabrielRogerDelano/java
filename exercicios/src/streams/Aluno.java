package streams;

public class Aluno {
	String nome;
	Double nota;
	
	public Aluno(String nome, Double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public String toString() {
		return nome + " tem nota " + nota;
	}
}
