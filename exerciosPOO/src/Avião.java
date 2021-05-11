
public class Avião {

	// Atributos do avião:
	private String modelo;
	private String ano;
	private String cor;
	private String proprietario;
	private  int capacidadeP;
	
	// construtor
	public Avião (String modelo, String ano, String cor, String proprietario, int capacidadep) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.proprietario = proprietario;
		this.capacidadeP = capacidadeP;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getCapacidadeP() {
		return capacidadeP;
	}

	public void setCapacidadeP(int capacidadeP) {
		this.capacidadeP = capacidadeP;
	}
	
	//metodo
	public String getDadosAviao() {
		 String DadosAviao = " Modelo do avião"+modelo+
					   "\n ano de criação: "+ano+
					   "\n Cor do avião: "+cor+
					   "\n Proprietario do avião : "+proprietario+
					   "\n Capacidade de pessoas que podem entrar nesse avião :"+capacidadeP;
		 
		return DadosAviao;
	}
}
