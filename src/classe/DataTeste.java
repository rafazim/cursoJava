package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		var d2 = new Data(20, 05, 1985);
		
		System.out.println(d1.obterDataFormatada());
		System.out.print(d2.obterDataFormatada());
	}
}
