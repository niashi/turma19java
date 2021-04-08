package ex2;

public class Aviao {
	private String modelo;
	private int capacidadePassageiros;
	private int velocidade;
	
	public int acelerar(int quantidade) {
		int novaVelocidade = this.velocidade + quantidade;	
		return novaVelocidade;
	}
}
