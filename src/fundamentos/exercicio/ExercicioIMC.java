package fundamentos.exercicio;

import java.util.Scanner;

public class ExercicioIMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o peso em KG:");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite a altura em metros:");
		double alt = entrada.nextDouble();
		
		//Lógica
		double imc = peso / Math.pow(alt, 2);
				
		System.out.println("O IMC é =" + imc);
		entrada.close();
		
	}

}
