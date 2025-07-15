package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	public static void main(String[] args) {
		Produto item1 = new Produto("Impressora", 900.0, 0.20, 130.0 );
		Produto item2 = new Produto("SSD 1TB", 320.0, 0.30, 0.0 );
		Produto item3 = new Produto("RX 450", 700.0, 0.0, 80.0 );
		
		List<Produto> produtos = Arrays.asList(item1, item2, item3); 
		
		Predicate<Produto> FreteGratis = p -> p.frete <= 0;
		Predicate<Produto> descontoMaiorQue30 = p -> p.desconto >= 0.3;
		Function<Produto, String> chamadaPromocional = p -> "Confira!! "+ p.nome +" de R$" + p.preco + " saindo por R$"+ p.preco * (1 - p.desconto); 
		
		produtos.stream()
			.filter(FreteGratis)
			.filter(descontoMaiorQue30)
			.map(chamadaPromocional)
			.forEach(System.out::println);		
	}
}
