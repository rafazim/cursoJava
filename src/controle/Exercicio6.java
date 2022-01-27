package controle;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int numero;
		int numSorteado;
		Random numAleatorio = new Random();
		numSorteado = numAleatorio.nextInt(101);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tente adivinhar o número entre 0 - 100: ");
			numero = entrada.nextInt();
			
			if (i == 10) {
			System.out.println("Que pena vc não acertou o número :´(");
			}else if (numero < numSorteado) {
				System.out.println("O número digitado é menor que o número armazenado");
				System.out.println("Você tem " + (10 - i) + " tentativas.");
			} else if (numero > numSorteado) {
				System.out.println("O número digitado é maior que o número armazenado");
				System.out.println("Você tem " + (10 - i) + " tentativas.");
			} else if (numero == numSorteado) {
				System.out.println("Parabéns, vc acertou!");
				break;
			}
		}
		
		System.out.println("Fim!");
		entrada.close();
	}
}
