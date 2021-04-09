package entities;

public class Cachorro extends Animal {
	
	private String pelagem;

	public Cachorro(String nome, int idade, String pelagem) {
		super(nome, idade);
		this.pelagem = pelagem;
	}

	public String getPelagem() {
		return pelagem;
	}

	private void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	public void correr() {
		System.out.println("O animal saiu correndo...");
	}
}
