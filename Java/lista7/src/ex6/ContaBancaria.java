package ex6;

public class ContaBancaria {

	// Atributos
	private String banco;
	private double saldo;
		
	// Construtor
	public ContaBancaria (String banco, double saldo) {
		this.banco = banco;
		this.saldo = saldo;
	}
		
	// Método
	public double debitar(double quantidade) {
		double novoSaldo = this.saldo - quantidade;	
		return novoSaldo;
	}
	public double creditar(double quantidade) {
		double novoSaldo = this.saldo + quantidade;
		return novoSaldo;
	}
}
