import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, quant;
		double total = 0;
		
		cod = sc.nextInt();
		quant = sc.nextInt();
		
		switch (cod) {
		case 1:
				total = quant * 4.00;
				break;
		case 2:
				total = quant * 4.50;
				break;
		case 3:
				total = quant * 5.00;
				break;
		case 4:
				total = quant * 2.00;
				break;
		case 5:
				total = quant * 1.50;
				break;
		}
		
		System.out.printf("TOTAL: R$ %.2f%n", total);
		
		sc.close();

	}

}
