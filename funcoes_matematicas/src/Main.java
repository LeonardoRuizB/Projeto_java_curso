public class Main {
	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		//Raiz quadrada 
		A = Math.sqrt(x);
		//Raiz quadrada
		B = Math.sqrt(y);
		//Raiz quadrada
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		//Potenciação, ou seja, X elevado a Y
		A = Math.pow(x, y);
		//Potenciação, ou seja, X elevado a 2.0
		B = Math.pow(x, 2.0);
		//Potenciação de 5.0 elevado a 2.0
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		//Valor absoluto é tirar o sinal negativo caso exista
		A = Math.abs(y);
		//Valor absoluto é tirar o sinal negativo caso exista
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}
}