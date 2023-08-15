package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		// array com quantodade de elementos ddeterminadas
		double[] notasAlunoA = new double[4];
		//no inicio uma array comecao com valores = 0
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 8.4;
		notasAlunoA[1] = 6.4;
		notasAlunoA[2] = 7.6;
		notasAlunoA[3] = 9.3;
		
		System.out.println("notas do aluno A : " + Arrays.toString(notasAlunoA));
	
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println("media A : " + total / notasAlunoA.length );
		
		//array de forma simplificada, com os elementos determinados != de quantidade determinada
		//
		double[] notasAlunoB = { 4.5, 8.3, 9.5, 7.6};
		System.out.println("notas do aluno B : " + Arrays.toString(notasAlunoB));
		
		double totalAlunoB = 0;
		
		for (double totalB : notasAlunoB) {
			totalAlunoB += totalB;
		}

		/*
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		*/
		System.out.println("media B : " + totalAlunoB / notasAlunoB.length);
	}
}
