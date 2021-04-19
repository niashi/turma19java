package entities;

public class Celular extends Produto {
	
	// Atributos
	double armazenamento;

	public Celular(String marca, double preco, int armazenamento) {
		super(marca, preco);
		this.armazenamento = armazenamento;
	}
	
	// Getters & Setters
	public double getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(double armazenamento) {
		this.armazenamento = armazenamento;
	}	
}
