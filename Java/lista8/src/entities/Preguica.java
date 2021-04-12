package entities;

public class Preguica extends Animal {
	
	// Atributos
	private double tamanhoGarras;
	
	// Construtor
	public Preguica(String nome, int idade, double tamanhoGarras) {
		super(nome, idade);
		this.tamanhoGarras = tamanhoGarras;
	}
	
	// Getters & Setters
	public double getTamanhoGarras() {
		return tamanhoGarras;
	}

	private void setTamanhoGarras(double tamanhoGarras) {
		this.tamanhoGarras = tamanhoGarras;
	}
	
	// Métodos
	public void subirEmArvore() {
		System.out.println("O animal subiu na árvore...");
	}
	
	public void emitirSom() {
		System.out.println("Som de preguiça (?)");
	}	
}
