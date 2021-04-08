package ex7;

public class Paciente {

	// Atributos
	private String nome;
	private String rg;
		
	// Construtor
	public Paciente (String nome, String rg) {
		this.nome = nome;
		this.rg = rg;
	}
		
	// Método
	void getNomeRg() {
		System.out.printf("O nome do paciente é %s e seu RG é %s." , this.nome , this.rg);		
	}
}
