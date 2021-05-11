public class Cliente {

//Atributos da classe Cliente

	private String nomeCliente;
	private String endereco;
	private String telefone;
	private String sexo;
	private int idade;
	
	// construtor
	public Cliente(String nomeCliente, String endereço, String telefone, String sexo, int idade) {
		this.nomeCliente = nomeCliente;
		this.endereco = endereço;
		this.telefone = telefone;
		this.sexo = sexo;
		this.idade = idade;

	}
	//metodo

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getDadosCliente() {
		 String DadosCliente = " Nome: "+nomeCliente+
					   "\n endereço: "+endereco+
					   "\n numero de telefone para contato : "+telefone+
					   "\n sexo : "+sexo+
					   "\n idade : "+ idade;
		 
		return DadosCliente;
	}
	


}
