
public class Animal {
	// Atributos do animal:
	
		private String nomeAnimal;
		private String idade;
		private String cor;
		private String tipo;
		
	public Animal (String nomeAnimal, String idade, String cor, String tipo) {
		this.nomeAnimal = nomeAnimal;
		this.idade = idade;
		this.cor = cor;
		this.tipo = tipo;
		
	
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Animal [nomeAnimal=" + nomeAnimal + ", idade=" + idade + ", cor=" + cor + ", tipo=" + tipo + "]";
	}
	
		
		
}
