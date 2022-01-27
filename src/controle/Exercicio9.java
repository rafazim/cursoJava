package controle;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int maiorValor = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o valor: ");
			int valor = entrada.nextInt();
			
			if (valor > maiorValor) {
				maiorValor = valor;
			}
		}		
		System.out.println("O maior valor digitado foi: " + maiorValor);
		entrada.close();
	}
}
