package fundamentos;

import java.util.Scanner;

public class TipoNextInt {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Qual a sua idade?");
		int idade = teclado.nextInt();
		teclado.nextLine(); //l� o "\n" que o teclado.nextInt() deixa para tr�s.
		System.out.println("Qual o seu nome?");
		String nome = teclado.nextLine();
		System.out.println("Qual o seu sobrenome?");
		String sobrenome = teclado.nextLine();
		 
		teclado.close();
		
		System.out.printf("O seu nome � %s %s e vc tem %d anos.", nome, sobrenome, idade);
	}

}
