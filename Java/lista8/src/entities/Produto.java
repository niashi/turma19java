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

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
