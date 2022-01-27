package fundamentos.exercicio;

import java.util.Scanner;

public class ExercicioAreaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		double altura = entrada.nextDouble();
		
		//Lógica
		double area = (base * altura) / 2;
		
		System.out.printf("A área do triangulo é = " + area);
		entrada.close();
		
	}

}
