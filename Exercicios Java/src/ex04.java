import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		float[][] A = new float[2][2];
		float[][] B = new float[2][2];
		float[][] C = new float[2][2];
		float consta;
		int op = 0;

		Scanner sc = new Scanner(System.in);

		
		System.out.println("Digite os valores da primeira Matriz 2 x 2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("["+(i+1)+"]["+(j+1)+"]: ");
				A[i][j] = sc.nextFloat();
			}
		}

		
		System.out.println("\nDigite os valores da segunda Matriz 2 x 2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("["+(i+1)+"]["+(j+1)+"]: ");
				B[i][j] = sc.nextFloat();
			}
		}

		while (op != 5) {
			System.out.print("\n\n\tMenu de opções:"
					+ "\n1- Somar as duas matrizes"
					+ "\n2- Subtrair a primeria matriz da segunda"
					+ "\n3- Adicionar uma constante as duas matrizes"
					+ "\n4- Imprimir as matrizes"
					+ "\n5 - Sair"
					+ "\n\nDigite sua opção: ");
			op = sc.nextInt();

			switch(op) {
			case 1:
				
				System.out.println("\n\tMatrizes somadas!");

				for(int i = 0; i < 2; i++) {
					for(int j = 0; j < 2; j++) {
						C[i][j] = A[i][j] + B[i][j];
						System.out.println("["+(i+1)+"]["+(j+1)+"]: "+C[i][j]);
					}
				}
				break;

			case 2:
				
				System.out.println("\n\tMatrizes subtraidas!");

				for(int i = 0; i < 2; i++) {
					for(int j = 0; j < 2; j++) {
						C[i][j] = B[i][j] - A[i][j];
						System.out.println("["+(i+1)+"]["+(j+1)+"]: "+C[i][j]);
					}
				}
				break;

			case 3:
				
				System.out.println("\nEntre com um valor da constante: ");
				consta = sc.nextFloat();

				System.out.println("\n\tMatrizes somadas com a constante!");

				for(int i = 0; i < 2; i++) {
					for(int j = 0; j < 2; j++) {
						A[i][j] = A[i][j] + consta;
						System.out.println("["+(i+1)+"]["+(j+1)+"]: "+A[i][j]);
					}
				}

				for(int i = 0; i < 2; i++) {
					for(int j = 0; j < 2; j++) {
						B[i][j] = B[i][j] + consta;
						System.out.println("["+(i+1)+"]["+(j+1)+"]: "+B[i][j]);
					}
				}
				break;

			case 4:
				
				System.out.println("\n\tMatriz A:");
					for(int i = 0; i < 2; i++) {
						for(int j = 0; j < 2; j++) {
							System.out.println("["+(i+1)+"]["+(j+1)+"]: "+A[i][j]);
						}
					}

				System.out.println("\n\tMatriz B:");
					for(int i = 0; i < 2; i++) {
						for(int j = 0; j < 2; j++) {
							System.out.println("["+(i+1)+"]["+(j+1)+"]: "+B[i][j]);
						}
					}
				break;

			case 5:
				System.out.println("\nEncerrando programa...");
				break;

			default:
				System.err.println("\nOpção inválida");
				break;
			}

		}
	}		
}
