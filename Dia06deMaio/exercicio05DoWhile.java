package Dia06deMaio;

import java.util.Scanner;

public class exercicio05DoWhile {
	public  static  void  main ( String [] args ) {

		int numero, somaNum =  0 ;
		 Scanner leia = new Scanner(System.in);
		 
		 do {
			 System.out.println("Entre com numero : ");
			  numero = leia.nextInt();
			  somaNum = somaNum + numero;
	
		 }
		  while (numero !=  0 );
		  
		    System.out.println("\n O resultado da soma é : " + somaNum);
		    
	 	    
		  

}
	
}
