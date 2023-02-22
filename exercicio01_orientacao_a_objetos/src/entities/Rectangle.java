package entities;

public class Rectangle {
	
	public double largura;
	public double altura;
	public double area;
	public double perimeter;
	public double diagonal;
	
	public double area() {
		return largura * altura;
	}
	
	public double perimeter() {
		return 2 * (largura + altura);
	}
	
	public double diagonal() {
		return Math.sqrt((largura * largura) + (altura * altura));
	}

	public String toString() {
		return String.format("AREA = %.2f%n", area()) 
				+ String.format("PERIMETER = %.2f%n", perimeter()) 
				+ String.format("DIAGONAL = %.2f%n", diagonal());
	}
}
