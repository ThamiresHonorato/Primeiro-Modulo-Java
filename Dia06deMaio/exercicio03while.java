package Dia06deMaio;
import java.util.Scanner;

public class exercicio03while {
 public static void main(String[]args) {
	 
	 int idade =  0 , quantIdade21 =  0 , quantIdade50 =  0 ;
	 Scanner leia = new Scanner(System.in);
	 
	  System.out.println("Digite uma idade : ");
	   idade = leia.nextInt();
	   while (idade != -99){
		   if (idade <  21 ) {
				quantIdade21 ++ ;

			} else  if (idade >  50 ) {
				quantIdade50 ++ ;
			}
		   System.out.println(" Digite idade : ");
		   idade = leia.nextInt();
		   
	   }
		  
	   System.out.println(" Total de pessoas com  menos de 21 anos : "+ quantIdade21);
	   System.out.println(" Total de pessoas acima de 50 anos : "+ quantIdade50);
 }
 
 
 
}
