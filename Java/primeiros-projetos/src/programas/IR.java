package programas;

import java.util.Locale;
import java.util.Scanner;

public class IR {

	public static void main(String[] args) {
		
		// 1500 ISENTO/ISENTE/ISENTA
		// 1500 AT� 2500 PAGA 15%
		// ACIMA DE 2500 PAGA 25%
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		String nome, tratamento;
		double salario, salarioComImposto;
		
		System.out.print("Por favor, informe seu nome: ");
		nome = leia.nextLine();
		System.out.print("\nOl�, " + nome + ", informe tamb�m como deseja ser tratado: [Senhor/Senhora/Senhore] ");
		tratamento = leia.next();
		System.out.print("\nAgora, informe seu sal�rio: ");
		salario = leia.nextDouble();
		
		
		
		if (tratamento == "Senhor" || tratamento == "senhor" || tratamento == "sr") {			
			if (salario < 1500.0) {
				System.out.println("\nVoc� est� isento do pagamento de impostos.");
			} else if (salario >= 1500.0 && salario <= 2500.0) {
				salarioComImposto = salario - (salario  * 0.15);
				System.out.println("\nVoc� pagar� 15% de impostos. Seu sal�rio l�quido � de R$" + salarioComImposto + ".");
			} else {
				salarioComImposto =  salario - (salario * 0.25);
				System.out.println("\nVoc� pagar� 25% de impostos. Seu sal�rio l�quido � de R$" + salarioComImposto + ".");
			}
		} else if (tratamento == "Senhora" || tratamento == "senhora" || tratamento == "sra") {
			if (salario < 1500.0) {
				System.out.println("\nSenhora, voc� est� isenta do pagamento de impostos.");
			} else if (salario >= 1500.0 && salario <= 2500.0) {
				salarioComImposto = salario - (salario  * 0.15);
				System.out.println("\nSenhora, voc� pagar� 15% de impostos. Seu sal�rio l�quido � de R$" + salarioComImposto + ".");
			} else {
				salarioComImposto =  salario - (salario * 0.25);
				System.out.println("\nSenhora, voc� pagar� 25% de impostos. Seu sal�rio l�quido � de R$" + salarioComImposto + ".");
			}
		} else {
			if (salario < 1500.0) {
				System.out.println("\nSenhore, voc� est� isento do pagamento de impostos.");
			} else if (salario >= 1500.0 && salario <= 2500.0) {
				salarioComImposto = salario - (salario  * 0.15);
				System.out.println("\nSenhore, voc� pagar� 15% de impostos. Seu sal�rio l�quido � de R$" + salarioComImposto + ".");
			} else {
				salarioComImposto =  salario - (salario * 0.25);
				System.out.println("\nSenhore, voc� pagar� 25% de impostos. Seu sal�rio l�quido � de R$" + salarioComImposto + ".");
			}
		}


	}
}
