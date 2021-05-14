import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {	
		
		int op;

		ArrayList<String> estoque = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("\n1- Armazenar produtos no estoque"
					+ "\n2- Remover produtos "
					+ "\n3- Atualizar produtos "
					+ "\n4- Mostrar todos os produtos do estoque"
					+ "\n0 - Sair"
					+ "\n\nDigite sua op��o: ");
			op = sc.nextInt();
			sc.nextLine();

			String produto, produtoAtt;
			boolean repetir = true;
			int opRepetir;

			switch(op) {
			case 1:
				do {
					System.out.println("\nDigite um por um o nome do(s) produto(s) que iram ser armazenado(s) no estoque"
							+ "\nOu digite 0 (Zero) quando quiser parar:");
					produto = sc.nextLine().toLowerCase();
					if(produto.equals("0")) {
						repetir = false;
						break;
					}

					estoque.add(produto);

				} while(repetir == true);

				break;

			case 2:
				do {
					System.out.println("\nProdutos no estoque:");
					System.out.println(estoque);
					System.out.println("\n\nDigite o nome do produto para ser removido:");
					produto = sc.nextLine().toLowerCase();

					if(estoque.contains(produto)) {
						estoque.remove(produto);

					} else {
						System.err.println("\nEsse produto n�o existe no estoque!\n");
					}

					System.out.print("\nDesejar remover outro produto?"
							+ "\n1- Sim"
							+ "\n2- N�o"
							+ "\nQual sua op��o? ");
					opRepetir = sc.nextInt();
					sc.nextLine();

					if(opRepetir == 1) {
						repetir = true;
					} else {
						repetir = false;
					}

				} while(repetir == true);

				break;

			case 3:
				do {
					System.out.println("\nProdutos no estoque:");
					System.out.println(estoque);
					System.out.println("\n\nDigite o nome do produto para ser atualizado:");
					produto = sc.nextLine().toLowerCase();

					System.out.println("\nDigite o nome do novo produto que ir� substituir o produto "+produto);
					produtoAtt = sc.nextLine().toLowerCase();

					if(estoque.contains(produto)) {
						estoque.remove(produto);
						estoque.add(produtoAtt);

					} else {
						System.err.println("\nEsse produto n�o existe no estoque!\n");
					}

					System.out.print("\nDesejar atualizar outro produto?"
							+ "\n1- Sim"
							+ "\n2- N�o"
							+ "\nQual sua op��o? ");
					opRepetir = sc.nextInt();
					sc.nextLine();

					if(opRepetir == 1) {
						repetir = true;
					} else {
						repetir = false;
					}

				} while(repetir == true);

				break;

			case 4:
				System.out.println("\nProdutos no estoque:");
				System.out.println(estoque);
				break;

			case 0:
				System.out.println("\nEncerrando programa...");
				break;

				default:
					System.err.println("\nOp��o inv�lida, tente novamente!");
			}

		}while(op != 0);

		sc.close();
	}

}
