package controle;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int valor = 0;
		int total = 0;
		
		while (valor >= 0) {
			System.out.println("Digite o valor: ");
			valor = entrada.nextInt();
			
			if (valor >= 0) {
				total += valor;
				System.out.println("Soma até o momento : " + total);				
			}
		}
		
		System.out.println("Fim!");
		entrada.close();
	}
}
