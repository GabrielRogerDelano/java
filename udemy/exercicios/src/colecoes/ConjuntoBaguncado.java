package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	//para esconder os alertas
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		//usando o HashSet
		
		// alguns metodos de conjuntos
		// add, remove, contains, retainAll, clear
		
		//inicia uma instancia de hashSet
		HashSet conjunto = new HashSet();
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
	
		// size diz o tamanho do conjunto
		System.out.println("O tamanho e : " + conjunto.size());
		
		//add adiciona um elemento ao conjunto
		conjunto.add("Teste");
		
		// quando adiciona um elemento igual a um que ja tem na colletion, 
		//ele nao conta
		System.out.println("O tamanho e : " + conjunto.size());
		
		//removendo elemento
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println("O tamanho e : " + conjunto.size());
		
		//consultado sem tem um valor na colection
		System.out.println("Tem um booleano true? : " + conjunto.contains(true));
		System.out.println("Tem um double 1.2? : " + conjunto.contains(1.2));
		System.out.println("Tem uma String 'Teste'? : " + conjunto.contains("Teste"));
		
		//iniciando outra instancia
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// uniao entre dois conjuntos
		conjunto.addAll(nums);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// deixa somente os conjuntos que tem em comum, removendo os demais
		conjunto.retainAll(nums);
		
		System.out.println(nums);
		System.out.println(conjunto); 
		
		//limpa o conjunto
		conjunto.clear();
		System.out.println(conjunto); 
		
	}
}
