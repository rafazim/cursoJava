package fundamentos.exercicio;

import java.util.Scanner;

public class ExercicioBhaskara {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Equa��o: ax� + bx + c = 0");

		System.out.println("Digite o valor de A:");
		int a = entrada.nextInt();
		
		System.out.println("Digite o valor de B:");
		int b = entrada.nextInt();
		
		System.out.println("Digite o valor de C:");
		int c = entrada.nextInt();
		
		//L�gica
		int delta = (b * b) - 4 * a * c;
        
		System.out.printf("\nSua equa��o �: %dx� + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO delta �: " + delta);

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equa��o �: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equa��o �: %.2f" ,x2);
		
		entrada.close();
	}

}
