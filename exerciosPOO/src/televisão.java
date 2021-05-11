
public class televisão {
	//Atributos da classe televisão

		private String resolucao;
		private String marca;
		private String polegadas;
		private String tipodeT;
		private int valor;
		
		// construtor
		public televisão (String resolucao, String marca, String polegadas, String tipodeT, int valor) {
			this.resolucao = resolucao;
			this.marca = marca;
			this.polegadas = polegadas;
			this.tipodeT = tipodeT;
			this.valor = valor;
		}
		//metodo
		
					public String getResolucao() {
				return resolucao;
			}



			public void setResolucao(String resolucao) {
				this.resolucao = resolucao;
			}



			public String getMarca() {
				return marca;
			}



			public void setMarca(String marca) {
				this.marca = marca;
			}



			public String getPolegadas() {
				return polegadas;
			}



			public void setPolegadas(String polegadas) {
				this.polegadas = polegadas;
			}



			public String getTipodeT() {
				return tipodeT;
			}



			public void setTipodeT(String tipodeT) {
				this.tipodeT = tipodeT;
			}



			public int getValor() {
				return valor;
			}



			public void setValor(int valor) {
				this.valor = valor;
			}

			public String getDadosTelevisão() {
				String DadosTelevisão= "A resolução da Televisão é de: "+resolucao+
						"\nA marca da televisão : "+marca+
						"\nA televisão tem polegadas"+polegadas+
						"\nO tipo de tela : "+tipodeT+
						"\n O valor dessa televisão é : "+valor;
				
				
				return DadosTelevisão;
			}
}
