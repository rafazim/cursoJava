package controle;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int contadorDeDivisores = 0;
		System.out.println("Digite um n�mero para verificar se � primo: ");
		int numero = entrada.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		
		switch (contadorDeDivisores) {

		case 0:
			System.out.println("O numero " + numero + " � um numero primo.");
			break;

		default:
			System.out.println("O numero " + numero + "  n�o � um numero primo.");
		}

		entrada.close();
	}
}
