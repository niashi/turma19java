package programas;

import java.util.Locale;
import java.util.Scanner;

public class IR {

	public static void main(String[] args) {
		
		// 1500 ISENTO/ISENTE/ISENTA
		// 1500 ATÉ 2500 PAGA 15%
		// ACIMA DE 2500 PAGA 25%
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		String nome, tratamento;
		double salario, salarioComImposto;
		
		System.out.print("Por favor, informe seu nome: ");
		nome = leia.nextLine();
		System.out.print("\nOlá, " + nome + ", informe também como deseja ser tratado: [Senhor/Senhora/Senhore] ");
		tratamento = leia.next();
		System.out.print("\nAgora, informe seu salário: ");
		salario = leia.nextDouble();
		
		
		
		if (tratamento == "Senhor" || tratamento == "senhor" || tratamento == "sr") {			
			if (salario < 1500.0) {
				System.out.println("\nVocê está isento do pagamento de impostos.");
			} else if (salario >= 1500.0 && salario <= 2500.0) {
				salarioComImposto = salario - (salario  * 0.15);
				System.out.println("\nVocê pagará 15% de impostos. Seu salário líquido é de R$" + salarioComImposto + ".");
			} else {
				salarioComImposto =  salario - (salario * 0.25);
				System.out.println("\nVocê pagará 25% de impostos. Seu salário líquido é de R$" + salarioComImposto + ".");
			}
		} else if (tratamento == "Senhora" || tratamento == "senhora" || tratamento == "sra") {
			if (salario < 1500.0) {
				System.out.println("\nSenhora, você está isenta do pagamento de impostos.");
			} else if (salario >= 1500.0 && salario <= 2500.0) {
				salarioComImposto = salario - (salario  * 0.15);
				System.out.println("\nSenhora, você pagará 15% de impostos. Seu salário líquido é de R$" + salarioComImposto + ".");
			} else {
				salarioComImposto =  salario - (salario * 0.25);
				System.out.println("\nSenhora, você pagará 25% de impostos. Seu salário líquido é de R$" + salarioComImposto + ".");
			}
		} else {
			if (salario < 1500.0) {
				System.out.println("\nSenhore, você está isento do pagamento de impostos.");
			} else if (salario >= 1500.0 && salario <= 2500.0) {
				salarioComImposto = salario - (salario  * 0.15);
				System.out.println("\nSenhore, você pagará 15% de impostos. Seu salário líquido é de R$" + salarioComImposto + ".");
			} else {
				salarioComImposto =  salario - (salario * 0.25);
				System.out.println("\nSenhore, você pagará 25% de impostos. Seu salário líquido é de R$" + salarioComImposto + ".");
			}
		}


	}
}
