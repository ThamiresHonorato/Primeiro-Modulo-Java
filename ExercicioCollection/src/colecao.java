import java.util.ArrayList;
import java.util.Collection;

public class colecao {
	public static void main(String args[]) {
		Collection<String> nomes = new ArrayList();
		nomes.add(" Julia");
		nomes.add(" Junior");
		nomes.add(" Gloria");
		nomes.add(" Marcos");
		System.out.println("Lista de nomes :"+ nomes);
		nomes.clear();
		/*System.out.println("Lista de nomes :" + nomes);
		nomes.remove("Gloria");
		
		System.out.println("Lista de nomes :"+ nomes);
		/*
		 * if(nomes.isEmpty()) { System.out.println("Lista vazia"); } else {
		 * System.out.println("Lista de nomes :"+ nomes); }
		 */

	}

}
