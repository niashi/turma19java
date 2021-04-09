package entities;

public class Preguica extends Animal {

	private double tamanhoGarras;

	public Preguica(String nome, int idade, double tamanhoGarras) {
		super(nome, idade);
		this.tamanhoGarras = tamanhoGarras;
	}
	
	public double getTamanhoGarras() {
		return tamanhoGarras;
	}

	private void setTamanhoGarras(double tamanhoGarras) {
		this.tamanhoGarras = tamanhoGarras;
	}
	
	public void subirEmArvore() {
		System.out.println("O animal subiu na árvore...");
	}
	
}
