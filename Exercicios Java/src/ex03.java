import java.util.Scanner;
public class ex03 {
	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int maior10 = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com os valores da Matriz 3 x 3:");
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("["+(i+1)+"]["+(j+1)+"]: ");
				matriz[i][j] = leia.nextInt();

				if(matriz[i][j] > 10) {
					maior10++;
				}	
			}
		}

		System.out.println("\nA Matriz 3 x 3 possui "+maior10+" valores maiores que 10");

		
	}

}
