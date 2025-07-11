package streams;

public class Funcionario {
	String nome;
	Double salario;
	Integer mesesTrabalhados;
	
	public Funcionario(String nome, Double salario, Integer mesesTrabalhados) {
		this.nome = nome;
		this.salario = salario;
		this.mesesTrabalhados = mesesTrabalhados;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", mesesTrabalhados=" + mesesTrabalhados + "]";
	}

	
}
