package fundamentos.exerciciosmoduloum;
import java.util.Scanner;

public class ConveterCelsiusToFahrenheit {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double f;
		double c;
		final double const1 = 1.8;
		final int const2 = 32;
		
		System.out.print("Digite a temperatura em Celsius: ");
		c = entrada.nextDouble();
		
		f = c*const1+const2;
		System.out.printf("A temperatura %.2f �C em �F � %.2f� ",c,f);
		entrada.close();
	}

}
