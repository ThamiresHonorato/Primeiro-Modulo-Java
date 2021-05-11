
public class Cavalo extends Animal{
	private String pelo;
	private String peso;
	private String sexo;
	
	public Cavalo(String nomeAnimal, String idade, String cor, String tipo, String string, String string2, String string3) {
		super(nomeAnimal, idade, cor, tipo);
		this.pelo= pelo;
		this.peso=peso;
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
	
	
}
