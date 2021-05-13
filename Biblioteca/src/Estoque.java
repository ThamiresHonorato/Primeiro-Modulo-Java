
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {

		int opcao;

		String titulo;
		String autor;
		String categoria;
		String editora;
		String isbn;
		int quantidade = 0;

		Scanner leia = new Scanner(System.in);

		

		for (int x = 1; x > 0; x++) {
			
			System.out.println("Gostaria de cadastrar o livro digite 1 ou 2 Para excluir  ou 3 Para sair do programa :");
			opcao = leia.nextInt();

			if (opcao == 1) {
				System.out.println(" Digite o Título que deseja :");
				titulo = leia.next();

				System.out.println("Digite o Autor que deseja : ");
				autor = leia.next();

				System.out.println(" Digite a categoria que deseja : ");
				categoria = leia.next();

				System.out.println(" Digite o editora que deseja :");
				editora = leia.next();

				System.out.println("Digite o isbn que deseja : ");
				isbn = leia.next();

				System.out.println(" Digite a quantidade que deseja : ");
				quantidade = leia.nextInt();

				Livro livro = new Livro(titulo, autor, categoria, editora, isbn, quantidade);
			} else if (opcao == 2) {
				System.out.println("Digite o isbn que deseja excluir : ");
				isbn = leia.next();

				Livro livro = new Livro();

				livro.setQuantidade(quantidade - 1);

			} else {
				System.out.println("O pragama encerrou!!! ");
				x=-1;
				
			}

		}

	}

}
