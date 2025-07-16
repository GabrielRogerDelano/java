package streams;

public class MediaTeste {
	public static void main(String[] args) {
		Media m1 = new Media();
		Media m2 = new Media();
		
		m1.adicionar(9.3);
		m1.adicionar(4.3);
		
		m2.adicionar(10.0);
		m2.adicionar(8.0);
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
		System.out.println(Media.combinar(m1, m2).getValor());
	}
}
