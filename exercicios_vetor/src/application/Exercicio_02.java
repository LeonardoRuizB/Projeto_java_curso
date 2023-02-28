package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		int n;
		double soma, media;
		
		System.out.print("Quantos numeros você vai digitar? ");
		n = sc.nextInt();
		double[] vetor = new double[n];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		soma = 0.0;
		for (int i=0; i<vetor.length; i++) {
			soma += vetor[i];
		}
		
		media = soma / n;
		
		System.out.print("VALORES = ");
		
		for (int i=0; i<vetor.length; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		
		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);
		
		sc.close();
	}

}
