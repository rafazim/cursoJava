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
			System.out.println("Tente adivinhar o n�mero entre 0 - 100: ");
			numero = entrada.nextInt();
			
			if (i == 10) {
			System.out.println("Que pena vc n�o acertou o n�mero :�(");
			}else if (numero < numSorteado) {
				System.out.println("O n�mero digitado � menor que o n�mero armazenado");
				System.out.println("Voc� tem " + (10 - i) + " tentativas.");
			} else if (numero > numSorteado) {
				System.out.println("O n�mero digitado � maior que o n�mero armazenado");
				System.out.println("Voc� tem " + (10 - i) + " tentativas.");
			} else if (numero == numSorteado) {
				System.out.println("Parab�ns, vc acertou!");
				break;
			}
		}
		
		System.out.println("Fim!");
		entrada.close();
	}
}
