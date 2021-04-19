package projetoEmpresa;

public class Terceiro extends Funcionario {

	private double adicional;
	
	// Construtor
	public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		this.adicional = adicional;
	}
	
	// M�todo override (trocar estes atributos para protected na classe m�o (Funcionario))
	@Override
	public double retornarSalario() {
		return (valorHora * horasTrabalhadas) + this.adicional;
	}
	
	// M�todo 
	public double retornarSalarioTerceiro() {
		return super.retornarSalario() + this.adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	private void setAdicional(double adicional) {
		this.adicional = adicional;
	}
}
