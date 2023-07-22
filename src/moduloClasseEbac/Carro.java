package moduloClasseEbac;

public class Carro {

	private String marca;
	private String cor;
	private String placa;
	private Integer velocidadeAtual;
	private Boolean chaveVirada;

	public Carro(String marca, String cor, String placa) {
		this.marca = marca;
		this.cor = cor;
		this.placa = placa;
		this.velocidadeAtual = 0;
		this.chaveVirada = false;
	}
	

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public Integer getVelocidadeAtual() {
		return velocidadeAtual;
	}


	public Boolean getChaveVirada() {
		return chaveVirada;
	}
	
	public void setChaveVirada(Boolean chaveVirada) {
		this.chaveVirada = chaveVirada;
	}

	public void ligar() {
		chaveVirada = true;
	}

	public void acelerar(Integer velocidade) {
		if (!chaveVirada)
			return;
		this.velocidadeAtual = velocidade;
	}


	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", cor=" + cor + ", placa=" + placa + ", velocidadeAtual=" + velocidadeAtual
				+ ", chaveVirada=" + chaveVirada + "]";
	}
	

}
