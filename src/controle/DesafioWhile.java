package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int notasValidas = 0;
		double total = 0;
		double nota = 0;
		
		while (nota != -1) {
			System.out.println("Digite a nota: ");
			nota = entrada.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
			notasValidas ++;
			total = nota + total;}
		}
		
		double media = total / notasValidas;
		System.out.println("Média: " + media);
		System.out.println("Notas válidas: " + notasValidas);
		entrada.close();
	}
}
