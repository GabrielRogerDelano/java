package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Toyota;

public class testeDeCarros {
	public static void main(String[] args) {
		
		Toyota toyota = new Toyota();
		Ferrari ferrari = new Ferrari();
		
		toyota.acelerar();
		System.out.println(toyota);
		
		toyota.acelerar();
		System.out.println(toyota);

		toyota.freiar();
		System.out.println(toyota);
		
		ferrari.acelerar();
		System.out.println(ferrari);
		
		ferrari.freiar();
		System.out.println(ferrari);
	
	}
}
