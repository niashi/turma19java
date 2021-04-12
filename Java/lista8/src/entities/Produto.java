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

	public String getPre�o() {
		return pre�o;
	}

	private void setPre�o(String pre�o) {
		this.pre�o = pre�o;
	}
	
}
