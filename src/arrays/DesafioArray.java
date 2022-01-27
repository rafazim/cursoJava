package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantidade de notas: ");
		int numNotas = entrada.nextInt();
		
		double[] notasAluno = new double[numNotas];

		for (int i = 0; i < notasAluno.length; i++) {
			System.out.print("Digite a nota " + (i + 1) + ": ");
			notasAluno[i] = entrada.nextDouble();
		}
		
//		System.out.println(Arrays.toString(notasAluno));

		double totalAluno = 0;
		for(double nota: notasAluno) {
			totalAluno += nota;
		}
		
		double media = totalAluno / notasAluno.length;
		System.out.println("A média é " + media + "!");	
		entrada.close();
	}
}
