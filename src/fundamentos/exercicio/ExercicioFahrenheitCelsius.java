package fundamentos.exercicio;

import java.util.Scanner;

public class ExercicioFahrenheitCelsius {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite os graus em Fahrenheit: ");
		double num1 = entrada.nextDouble();
		
		double resultado = (num1 - 32) * 5/9;	
				
		System.out.printf("A conversão em Celsius é = %.2fºC", resultado);
		entrada.close();
		
	}
}
