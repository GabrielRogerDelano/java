package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {
	
	private Campo campo;
	
	@BeforeEach
	void iniciarTeste() {
		campo = new Campo(3,3);
	}
	
	@Test
	void testeVizinoRealDistancia1Esquerda() {
		Campo vizinho = new Campo(3,4);
		boolean resultado = campo.AdicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVizinoRealDistancia1Direita() {
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.AdicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinoRealDistancia1EmCima() {
		Campo vizinho = new Campo(2,3);
		boolean resultado = campo.AdicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinoRealDistancia1EmBaixo() {
		Campo vizinho = new Campo(4,3);
		boolean resultado = campo.AdicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(1,5);
		boolean resultado = campo.AdicionarVizinho(vizinho);
		assertFalse(resultado);
	}
}
