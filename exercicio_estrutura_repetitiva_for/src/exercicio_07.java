import java.util.Scanner;

public class exercicio_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			System.out.print(i + " ");
			
			int quad = i * i;
			System.out.print(quad + " ");
			
			int cub = i * i * i;
			System.out.println(cub + " ");
		}
		
		sc.close();
	}

}
