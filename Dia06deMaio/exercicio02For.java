package Dia06deMaio;

import java.util.Scanner;

public class exercicio02For {

	public  static  void  main ( String [] args ) {

		int numero, quantPar =  0 , quantImpar =  0 ;
		Scanner leia = new Scanner(System.in);
		 for ( int x =  1 ; x <=  10 ; x ++ ) {
			 
			 System.out.println(" Entre com o " + x + " o n�mero: ");
			 numero = leia.nextInt();
			 
			 if (numero %  2  ==  0 ) {
				 quantPar ++ ;
			 }
			 else {
					quantImpar ++ ;
			 }
			 
			 System.out.println( " \n Entres os 10 n�meros digitados, " + quantPar + " s�o pares e " + quantImpar + " s�o �mpares ");
			 
		 }

}
}
