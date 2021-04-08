package ex2;

public class Aviao {
	
	// Atributos
	private String modelo;
	private int capacidadePassageiros;
	private int velocidade;
	
	// Construtor
	public Aviao (String modelo, int capacidadePassageiros, int velocidade) {
		this.modelo = modelo;
		this.capacidadePassageiros = capacidadePassageiros;
		this.velocidade = velocidade;
	}
	
	// Método
	public int acelerar(int quantidade) {
		int novaVelocidade = this.velocidade + quantidade;	
		return novaVelocidade;
	}
}
