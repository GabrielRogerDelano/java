package oo.abstrato;

public class TesteAnimal {
	public static void main(String[] args) {

		Mamifero a = new Cachorro();
		Cachorro b = new Cachorro();
		
		System.out.println(a.mover());
		System.out.println(a.respirar());
		System.out.println(a.mamar());
		System.out.println();
		
		System.out.println(b.mover());
		System.out.println(b.respirar());
		System.out.println(b.mamar());
		System.out.println(b.latir());
	}
}
