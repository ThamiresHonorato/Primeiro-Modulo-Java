
public class Cachorro extends Animal {

	private String pelo;
	private String rabo;
	private String patas;
	
	
	public Cachorro(String nomeAnimal, String idade, String cor, String tipo, 
			String pelo, String rabo, String patas) {
		super(nomeAnimal, idade, cor, tipo);
		this.pelo= pelo;
		this.rabo=rabo;
		this.patas = patas;
		
	}


	public String getPelo() {
		return pelo;
	}


	public void setPelo(String pelo) {
		this.pelo = pelo;
	}


	public String getRabo() {
		return rabo;
	}


	public void setRabo(String rabo) {
		this.rabo = rabo;
	}


	public String getPatas() {
		return patas;
	}


	public void setPatas(String patas) {
		this.patas = patas;
	}



	public  String getDadosCachorro() {
		 String DadosCachorro =  " O tipo de pelo do cachoro : " + pelo + ", rabo : " + rabo + ", Ele tem : " + patas  + super.toString();
					   
		 
		return DadosCachorro;
	}

	
	
	

}
