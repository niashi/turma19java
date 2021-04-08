package ex1;

public class Cliente {
	
	// Atributos
	private String primeiroNome;
	private String ultimoNome;
	private String cpf;
	
	// Construtor
	public Cliente (String primeiro, String ultimo, String cpf1) { // O nome do construtor será sempre o
		primeiroNome = primeiro;								   // nome da classe (neste caso, Cliente).
		ultimoNome = ultimo;
		cpf = cpf1;
	}
	
	// Método
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome + " " + ultimoNome;
		return nomeCompleto;
	}
	public String mostrarCpf() {
		return cpf;
	}
}
