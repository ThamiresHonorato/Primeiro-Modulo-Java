
public class TesteAnimais {

public static void main(String[] args) {
		
		CachorroAnimais cachorro = new CachorroAnimais ();
		CavaloAnimais cavalo = new CavaloAnimais();
		PreguicaAnimais preguica = new PreguicaAnimais();
		
		Animais animais = null;
		
		int n=(int)(Math.random()*3.0);
		System.out.println("\nAnimais:\n0 - cachorro\n1 - cavalo\n2 - preguiça"
							+ "\n\t--***--\nBarulho que o animal sorteado ("+n+") está fazendo: ");
		
		switch(n) {
		case 0: animais = cachorro;break;
		case 1: animais = cavalo;break;
		case 2: animais = preguica;break;
		default: System.err.println("\nErro inersperado.");
		}
		
		if(animais!=null) {
			animais.som("barulho");
		}

	}
}
