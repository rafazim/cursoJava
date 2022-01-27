package fundamentos.exercicio;

import java.util.Scanner;

public class ExercicioQuadradoCubo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número:");
		double num = entrada.nextDouble();
		
		//Lógica
		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
				
		System.out.printf("O quadrado é = %.2f e o cubo é = %.2f", quadrado, cubo);
		entrada.close();
	}

}
