package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		//+ - * / %
		
		double num1;
		double num2;
		String op;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo numero numero: ");
		num2 = entrada.nextDouble();
		
		double soma = num1+num2;
		String somamod = Double.toString(soma);
		
		double sub = num1 - num2;
		String submod = Double.toString(sub);
		
		double mult = num1 * num2;
		String multmod = Double.toString(mult);
		
		double div = num1 / num2;
		String divmod = Double.toString(div);
		
		double mod = num1 % num2;
		String modmod = Double.toString(mod);
		
				
		System.out.println("Digite a opera��o desejada: + - * / %: ");
		op = entrada.next();
		
		String resultado = op.equals("+") ? somamod :
			op.equals("-") ? submod : 
				op.equals("*")? multmod: 
					op.equals("/")? divmod :
						op.equals("%")? modmod : "Opera��o n�o identificada!";
		
		System.out.printf("Resultado %.2f %s %.2f = %s: ",num1,op,num2,resultado);
		
		entrada.close();
		
	}

}
