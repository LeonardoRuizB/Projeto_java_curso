import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario;
		double horasTrabalhadas, valorPorHora, SALARY;
		
		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextDouble();
		valorPorHora = sc.nextDouble();
		
		SALARY = horasTrabalhadas * valorPorHora;
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", SALARY);
		
		sc.close();
	}

}
