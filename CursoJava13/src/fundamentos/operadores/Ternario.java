package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 7;
		String resultadoparcial = media >=5.0 ? "em recupera��o" : "reprovado";
		String resultadofinal = media >=7.0 ? "aprovado" : resultadoparcial;
		
		System.out.println("O aluno est� " + resultadofinal);
	}

}
