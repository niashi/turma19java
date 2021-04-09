package entities;

public class Animal {

	// Atributos
	private String nome;
	private int idade;
	
	//Construtor
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
		if (som == "au") {
			System.out.println("au");
		} else if (som == "hiin in in hinir") {
			System.out.println("hiin in in hinir");
		}			
	}
	
	public void correr() {
		System.out.println("O animal saiu correndo...");
	}
}
