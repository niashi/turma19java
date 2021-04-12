package entities;

public abstract class Produto {
	
	// Atributos
	String marca;
	double preco;
	
	// Construtor
	public Produto(String marca, double preco) {
		super();
		this.marca = marca;
		this.preco = preco;
	}

	// Getters & Setters
	public String getMarca() {
		return marca;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPreço() {
		return preço;
	}

	private void setPreço(String preço) {
		this.preço = preço;
	}
	
}
