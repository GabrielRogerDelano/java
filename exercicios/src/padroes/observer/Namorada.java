package padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante{
	@Override
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar convidados");
		System.out.println("apagar luzes");
		System.out.println("esperar");
		System.out.println("e....surpresa");
	}
}
