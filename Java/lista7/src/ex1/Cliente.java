package ex1;

public class Cliente {
	
	// Atributos
	private String primeiroNome;
	private String ultimoNome;
	private String cpf;
	
	// Construtor
	public Cliente (String primeiroNome, String ultimoNome, String cpf) { // O nome do construtor será sempre o
		this.primeiroNome = primeiroNome;								   // nome da classe (neste caso, Cliente).
		this.ultimoNome = ultimoNome;
		this.cpf = cpf;
	}
	
	// Métodos
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome + " " + ultimoNome;
		return nomeCompleto;
	}
	public String mostrarCpf() {
		return cpf;
	}
}
