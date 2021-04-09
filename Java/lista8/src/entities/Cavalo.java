package entities;

public class Cavalo extends Animal {
	
	private double altura;

	public Cavalo(String nome, int idade, double altura) {
		super(nome, idade);
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}

	private void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void correr() {
		System.out.println("O animal saiu correndo...");
	}
}
