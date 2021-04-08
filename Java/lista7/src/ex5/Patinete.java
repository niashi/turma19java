package ex5;

public class Patinete {

	// Atributos
	private double altura;
	private int velocidade;
		
	// Construtor
	public Patinete (double altura, int velocidade) {
		this.altura = altura;
		this.velocidade = velocidade;
	}
	
	// Método
	public int frear(int quantidade) {
		int novaVelocidade = this.velocidade - quantidade;	
		return novaVelocidade;
	}
}
