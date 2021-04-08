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
		
	// M�todo
	void informarCodigo() {
		System.out.printf("O c�digo do funcion�rio %s � %s.\n" , this.primeiroNome , this.codigo);
	}
	void baterPonto() {
		System.out.printf("Ol�, %s, bom dia e bem vindo(a) � empresa %s. " , this.primeiroNome , this.empresa);
	}
}
