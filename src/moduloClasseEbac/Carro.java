/**
 * @author ruijose
 * 
 * @
 */
package moduloClasseEbac;

public class Carro {
	
	//Atributos
	private String marca;
	private String cor;
	private String placa;
	private Integer velocidadeAtual;
	private Boolean chaveVirada;
	
	//Construtor padrão
	public Carro() {}
	
	//Construtor com argumentos
	public Carro(String marca, String cor, String placa) {
		this.marca = marca;
		this.cor = cor;
		this.placa = placa;
		this.velocidadeAtual = 0;
		this.chaveVirada = false;
	}
	
	//metodos getter e setter
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
	
	//metodo para ligar veiculo
	public void ligar() {
		chaveVirada = true;
	}
	
	//metodo para acelerar veiculo
	public void acelerar(Integer velocidade) {
		if (!chaveVirada)
			return;
		this.velocidadeAtual = velocidade;
	}

	//metodo para apresentar as informações do veiculo
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", cor=" + cor + ", placa=" + placa + ", velocidadeAtual=" + velocidadeAtual
				+ ", chaveVirada=" + chaveVirada + "]";
	}
	

}
