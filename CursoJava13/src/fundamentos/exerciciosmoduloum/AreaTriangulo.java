package fundamentos.exerciciosmoduloum;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double alt;
		double base;
		
		System.out.print("Digite a Base do triangulo: ");
		base = entrada.nextDouble();
		
		System.out.print("Digite a Altura do triangulo: ");
		alt = entrada.nextDouble();
		
		double area = (base*alt)/2;
		
		System.out.printf("A area do triangulo com base %.2f e altura %.2f � %.2f",base,alt,area);
		
		
		entrada.close();
	}

}
