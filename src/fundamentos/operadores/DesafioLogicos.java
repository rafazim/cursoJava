package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean tomouSorvete = trabalho1 || trabalho2;
		//Operador Unário
		boolean maisSaudavel = !tomouSorvete;
		
		System.out.println("Comprou TV de 50\"?" + comprouTV50);
		System.out.println("Comprou TV de 32\"?" + comprouTV32);
		System.out.println("tomou sorvete?" + tomouSorvete);
		System.out.println("Mais saudável?" + maisSaudavel);
	}

}
