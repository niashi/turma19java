package ex6;

public class App {
	
	public static void main(String[] args) {
		
		ContaBancaria itau = new ContaBancaria("Ita�", 50000);
		
		System.out.printf("Seu novo saldo no banco � %.2f." , itau.debitar(5000));
		System.out.printf("\nSeu novo saldo no banco � %.2f." , itau.creditar(10000));
	}
}
