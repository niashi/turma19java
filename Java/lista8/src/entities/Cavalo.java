package entities;

public class Cavalo extends Animal {
	
	// Atributos
	private double altura;
	
	// Construtor
	public Cavalo(String nome, int idade, double altura) {
		super(nome, idade);
		this.altura = altura;
	}
	
	// Getters & Setters
	public double getAltura() {
		return altura;
	}

	private void setAltura(double altura) {
		this.altura = altura;
	}
	
	// Métodos
	public void correr() {
		System.out.println("O animal saiu correndo...");
	}
	
	public void emitirSom() {
		System.out.println("Som de cavalo");
	}
}
