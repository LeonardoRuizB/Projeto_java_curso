package application;

import java.util.Scanner;

public class Exercicio_fixacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How Many rooms will be rented? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		String[] nomes = new String[n];
		String[] emails = new String[n];
		int[] quartos = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.print("Email: ");
			emails[i] = sc.nextLine();
			System.out.print("Quarto: ");
			quartos[i] = sc.nextInt();
			System.out.println();
		}
				
		System.out.println("Busy rooms:");
		
		for (int i=0; i<n; i++) {
			if (n>0) {
				System.out.println(quartos[i] + ": " + nomes[i] + ", " + emails[i]);
			}
		}
		
		sc.close();
	}

}
