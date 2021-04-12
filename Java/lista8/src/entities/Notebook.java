package entities;

public class Notebook extends Produto {
	
	// Atributos
	boolean status;

	public Notebook(String marca, double preco, boolean status) {
		super(marca, preco);
		this.status = status;
	}

	// Getters & Setters
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
