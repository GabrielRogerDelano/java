package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador {
	
	private int linhas;
	private int colunas;
	private int minas;

	private final List<Campo> campos = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampo();
		assosciarOsVizinhos();
		sortearMinas();
	}
	
	public boolean ObjetivoAlcancado() {
		return campos.stream().allMatch(c -> c.ObjetivoAlcancado());
	}
	
	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}
	
	public void abrir(int linha,int coluna) {
		try {
			campos.stream()
				.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
				.findFirst()
				.ifPresent(c -> c.abrir());
		} catch (Exception e) {
			//FIXME Ajustar a implementacaodo metodo abrir
			campos.forEach(c -> c.setAberto(true));
			throw e;
		}
	}
	
	public void AlterarMarcacao(int linha,int coluna) {
		campos.stream()
			.filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
			.findFirst()
			.ifPresent(c -> c.alterarMarcacao());
	}
	
	private void gerarCampo() {
		for(int linha = 0; linha < linhas; linha++) {
			for(int coluna = 0; coluna < colunas; coluna++) {
				Campo campo = new Campo(linha, coluna);
				campo.registrarObservador(this);
				campos.add(campo);
			}
		}
	}
	
	private void assosciarOsVizinhos() {
		for(Campo c1: campos) {
			for(Campo c2: campos) {
				c1.AdicionarVizinho(c2);
			}
		}
	}
	
	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();
		
		do {
			int numeroaAleatorio = (int) (Math.random() * campos.size());
			campos.get(numeroaAleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
		
		} while (minasArmadas < minas);
	}
	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		if(evento == CampoEvento.EXPLODIR) {
			System.out.println("Perdeu");
		}else {
			System.out.println("Ganhou");
		}
	}
}	
