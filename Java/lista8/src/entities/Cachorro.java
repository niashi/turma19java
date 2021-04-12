package entities;

public class Cachorro extends Animal {
	
	// Atributos
	private String pelagem;
	
	// Construtor
	public Cachorro(String nome, int idade, String pelagem) {
		super(nome, idade);
		this.pelagem = pelagem;
	}
	
	// Getters & Setters
	public String getPelagem() {
		return pelagem;
	}

	private void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	// Métodos
	public void correr() {
		System.out.println("O animal saiu correndo...");
	}
	
	public void emitirSom() {
		System.out.println("Au au");
	}
}
