package Dia06deMaio;
import java.util.Scanner;

public class exercicioc06Dowhile {

	public  static  void  main ( String [] args ) {

		int num, media =  0 , somaNum = 0 , quant = 0 ;

		Scanner leia =  new  Scanner ( System.in);

		    do {
			System.out.println( " Entre com um número: " );
			num = leia.nextInt ();

			if (num %  3  ==  0  && num !=  0 ) 
				somaNum = somaNum + num;
				quant ++ ;
			

		      } 
		    while (num !=  0 );

		    	media = somaNum / quant;

		    	System.out.printf( " \n Média dos números múltiplos de 3:% 2.2f " , media);
  
		
	}

}
}
