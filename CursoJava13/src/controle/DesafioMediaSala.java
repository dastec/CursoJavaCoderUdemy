package controle;

import java.util.Scanner;

public class DesafioMediaSala {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int notainvalida = 0;
		int notavalida = 0;
		double total = 0;
		
		System.out.print("Digite uma nota: ");
		double nota = entrada.nextDouble();
		
		while(nota != -1)
		{
			if(nota>= 0 && nota <= 10)
			{
				notavalida++;
				total+=nota;
			}
			else
			{
				System.out.println("Nota inv�lida!");
				notainvalida++;
			}
		System.out.print("Digite uma nota: ");
		nota = entrada.nextDouble();
		}
		
		double media = total/notavalida;
	
		System.out.printf("A m�dia da turma foi %.2f e foi digitado %d notas v�lidas e %d inv�lidas!"
			,media,notavalida,notainvalida);
		
		
		
		
		
		
		
		entrada.close();
		
		
	}

}
