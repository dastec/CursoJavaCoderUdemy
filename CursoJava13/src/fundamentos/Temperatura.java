package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(�F - 32) * 5/9 = �C)
		double f=86;
		final int trdois=32;
		final double fator=5/9.0;
				
		double c = (f-trdois)*(fator);
		
		System.out.println("A conves�o de "+f+"�F para Celsius � "+c+"�C");
		
		f=150;
		c=(f-trdois)*(fator);
		System.out.println("A conves�o de "+f+"�F para Celsius � "+c+"�C");
	}

}
