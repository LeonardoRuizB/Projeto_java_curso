import java.util.Scanner;

public class bhaskara {

	public static void main(String[] args) {
		Scanner ba = new Scanner(System.in);
		
		double delta, a, b, c, x1, x2;
		
		System.out.println("Informe o valor de A: ");
		a = ba.nextDouble();
		System.out.println("Informe o valor de B: ");
		b = ba.nextDouble();
		System.out.println("Informe o valor de C: ");
		c = ba.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		System.out.println("O valor de delta é: " + delta);
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("O valor de X1 é: " + x1);
		System.out.println("O valor de X2 é: " + x2);
		
		ba.close();
	}

}
