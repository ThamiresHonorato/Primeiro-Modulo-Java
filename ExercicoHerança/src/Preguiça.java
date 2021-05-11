
public class Preguiça extends Animal {

	private String pelo;
	private String peso;
	private String sexo;

	public Preguiça(String nomeAnimal, String idade, String cor, String tipo, String pelo, String peso, String sexo) {
		super(nomeAnimal, idade, cor, tipo);
		this.pelo = pelo;
		this.peso = peso;
		this.sexo = sexo;
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDadosPreguica() {
		String DadosPreguica = " O tipo de pelo da preguiça: " + pelo + ", Seu peso : " + peso + ", Sexo: " + sexo
				+ super.toString();

		return DadosPreguica;

	}
}
