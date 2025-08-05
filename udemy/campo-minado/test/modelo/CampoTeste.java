package modelo;
import excecao.ExplosaoException;
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
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo(3,4);
		boolean resultado = campo.AdicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistancia1Direita() {
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.AdicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1EmCima() {
		Campo vizinho = new Campo(2,3);
		boolean resultado = campo.AdicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia1EmBaixo() {
		Campo vizinho = new Campo(4,3);
		boolean resultado = campo.AdicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoDistancia2() {
		Campo vizinho = new Campo(4,4);
		boolean resultado = campo.AdicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(1,5);
		boolean resultado = campo.AdicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	
	@Test
	void testeValorPadraoMarcacao() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlterarMarcacao() {
		campo.alterarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlterarMarcacaoDuasVezes() {
		campo.alterarMarcacao();
		campo.alterarMarcacao();		
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alterarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.alterarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}

	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		assertThrowsExactly(ExplosaoException.class, () -> {
				campo.abrir();
		});
	}
	
	@Test
	void testeAbrirComVizinhos1() {
		Campo campo1 = new Campo(1,1);
		Campo campo2 = new Campo(2,2);
		
		campo.AdicionarVizinho(campo2);
		campo2.AdicionarVizinho(campo1);
		
		campo.abrir();
		
		assertTrue(campo1.isAberto() && campo2.isAberto());
	}
	
	@Test
	void testeAbrirComVizinhos2() {
		Campo campo11 = new Campo(1,1);
		Campo campo12 = new Campo(1,2);
		campo12.minar();
		
		Campo campo22 = new Campo(2,2);
		campo.AdicionarVizinho(campo22);
		campo22.AdicionarVizinho(campo11);
		campo22.AdicionarVizinho(campo12);
		
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
}




