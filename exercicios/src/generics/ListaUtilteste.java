package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilteste {
	public static void main(String[] args) {
		List<String> langs = Arrays.asList("Java", "Python", "C");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String UltimaLinguagem = (String) ListaUtil.getUltimo1(langs);
		System.out.println(UltimaLinguagem);
		
		Integer UltimoNumero = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(UltimoNumero);

		
		String UltimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(UltimaLinguagem2);
		
		Integer UltimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);
		System.out.println(UltimoNumero2);
	}
}
