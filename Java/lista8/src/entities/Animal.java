package entities;

public class Animal {

	// Atributos
	private String nome;
	private int idade;
	
	// Construtor
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	// Getters & Setters
	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}
	
	// M�todos
	public void emitirSom(String som) {
		System.out.println("Som gen�rico de animal.");
	}
}
