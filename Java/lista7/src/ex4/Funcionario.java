package ex4;

public class Funcionario {
	
	// Atributos
	private String primeiroNome;
	private String codigo;
	private String empresa;
	private String cargo;
		
	// Construtor
	public Funcionario (String primeiroNome, String codigo, String empresa, String cargo) {
		this.primeiroNome = primeiroNome;
		this.codigo = codigo;
		this.empresa = empresa;
		this.cargo = cargo;
	}
		
	// Método
	void informarCodigo() {
		System.out.printf("O código do funcionário %s é %s.\n" , this.primeiroNome , this.codigo);
	}
	void baterPonto() {
		System.out.printf("Olá, %s, bom dia e bem vindo(a) à empresa %s. " , this.primeiroNome , this.empresa);
	}
}
