package controle;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();
		
		if (ano % 400 == 0) { 
			System.out.println(ano + " � um ano bissexto"); 
		}else if(ano % 4 == 0 && ano % 100 !=0){ 
		    	System.out.println(ano + " � um ano bissexto"); 
		} else {
			System.out.println(ano + " n�o � um ano bissexto");			
		}

		entrada.close();
	}
}