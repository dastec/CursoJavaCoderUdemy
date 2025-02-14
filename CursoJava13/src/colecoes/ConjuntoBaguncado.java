package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		//Adicionando elemnto
		conjunto.add(1.2);//double -> Double
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
	
		System.out.println("Tamanho � "+conjunto.size());
		
		//Removendo elemento
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho � "+conjunto.size());
		
		
		//Verificando se contem o elemento
		System.out.println("Contem? "+conjunto.contains('x'));
		System.out.println("Contem? "+conjunto.contains(1));
		System.out.println("Contem? "+conjunto.contains(true));
		
		Set nums = new HashSet();//Mesma coisa que se houvesse o hash
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		
		//conjunto.addAll(nums); //Uni�o entre dois conjuntos
		conjunto.retainAll(nums); //Intersec��o
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	
	}
	

}
