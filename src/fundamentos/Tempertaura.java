package fundamentos;


public class Tempertaura {

	public static void main(String[] args) {
		final int FIXOSUB = 32;
		final double MULTIP = 5/9.0;
		
		double FAHRENHEITS = 113;
		double CELSIUS = (FAHRENHEITS - FIXOSUB) * MULTIP;
		
		
		System.out.println("A conversão em ºC é: " + CELSIUS);
	}
}