package ex3;

public class ProdEletronico {
	
	// Atributos
	private String marca;
	private String modelo;
	private int volume;
		
	// Construtor
	public ProdEletronico (String marca, String modelo, int volume) {
		this.marca = marca;
		this.modelo = modelo;
		this.volume = volume;
	}
		
	// Métodos
	public int aumentarVolume(int porcentagem) {
		int novoVolume = this.volume + porcentagem;	
		return novoVolume;
	}
	public int diminuirVolume(int porcentagem) {
		int novoVolume = this.volume - porcentagem;
		return novoVolume;
	}
}
