package fundamentos.exercicio;

import java.util.Scanner;

public class ExercicioCelsiusFahrenheit {
	
	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os graus em Celsius: ");
		double num1 = entrada.nextDouble();
		
		double resultado = (num1 * 9/5) + 32;	
				
		System.out.printf("A convers�o em Fahrenheit � = %.2f�F", resultado);
		entrada.close();
		
	}
}
