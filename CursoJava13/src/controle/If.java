package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media >= 7 && media <=10) 
		{
			System.out.println("Aprovado");
			System.out.println("Parabens!");
		}
		
		if(media<7 && media>=5)
		{
			System.out.println("Em recupera��o");
		}
		if(media < 5 && media >= 0)
		{
			System.out.println("Reprovado");
		}
		if(media > 10 || media < 0)
		{
			System.out.println("M�dia invalida");
		}
		
		
		entrada.close();
		
		
	}

}
