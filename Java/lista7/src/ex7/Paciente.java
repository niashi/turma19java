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
		
	// M�todo
	void getNomeRg() {
		System.out.printf("O nome do paciente � %s e seu RG � %s." , this.nome , this.rg);		
	}
}
