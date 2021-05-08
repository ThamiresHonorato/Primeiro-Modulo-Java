
public class ex01 {
	public static void main(String[] args) {

		int[] A = {1, 0, 5, -2, -5, 7}; 
		int soma = 0;

		for(int i = 0; i < A.length; i++) {
			if(i == 0 || i == 1 || i == 5) {
				soma = soma + A[i]; 
			}
			if(i == 4) {
				A[i] = 100; 
			}

			System.out.println("A["+i+"] = "+A[i]); 
		}

		System.out.println("\nSoma dos valores das posições A[0], A[1] e A[5] = "+soma); 	
	}


}
