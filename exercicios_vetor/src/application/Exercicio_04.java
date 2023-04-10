package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posMaior;
		double maior;
		
		System.out.print("Quantos numeros você vai digitar? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		maior = vetor[0];
		posMaior = 0;
		
		for (int i=1; i<vetor.length; i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posMaior = i;
			}
		}
		
		System.out.println();
		
	    System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);	
		
		
		sc.close();
	}

}
