package programas;

import java.util.Scanner;

public class Desafio1 {
	
	public static void main(String[] args) {
		
		// Auxilio Emergencial: saber se a pessoa já recebeu anteriormente. Se ela for chefa de família: tem direito ao dobro do valor. 
		// Senão, não tem. Informar se recebe outro auxílio do governo. Se sim, não pode receber o novo auxílio. R$ 300,00 é o básico. Se for chefa,
		// 600. A cada filho, a pessoa ganha R$ 50,00 a mais.
		
		
		char chefaFamilia, auxilioAnterior, outroBeneficio, temFilhos;
		double valorBeneficio = 300.00;
		int quantiaFilhos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Auxílio Emergencial");
		System.out.print("\nVocê já recebe algum benefício do governo? [S/N] ");
		outroBeneficio = leia.nextLine().toUpperCase().charAt(0);
		if (outroBeneficio == 'N') {
			System.out.print("\nVocê recebeu o Auxílio Emergencial anteriormente? [S/N] ");
			auxilioAnterior = leia.nextLine().toUpperCase().charAt(0);
			
			if (auxilioAnterior == 'N') {
				System.out.print("\nVocê não tem direito ao Auxílio Emergencial");
			} else {
				System.out.print("\nVocê é uma mulher chefa de família? [S/N] ");
				chefaFamilia = leia.nextLine().toUpperCase().charAt(0);
				
				if (chefaFamilia == 'S') {
					valorBeneficio *= 2;
					System.out.println("\nVocê tem direito ao dobro do benefício.");
				}
				
				System.out.print("\nVocê tem filhos? [S/N] ");
				temFilhos = leia.nextLine().toUpperCase().charAt(0);
				
				if (temFilhos == 'S') {
					System.out.println("\nQuantos filhos você tem?");
					quantiaFilhos = leia.nextInt();
					valorBeneficio = valorBeneficio + (quantiaFilhos * 50);
					System.out.println("\nO valor do seu benefício é de R$" + valorBeneficio);
				} else {
					System.out.println("\nVocê não tem direito a valores adicionais por filho. O valor de seu auxílio é de R$" + valorBeneficio + ".");
				}
			}						
		} else {
			valorBeneficio = 0;
			System.out.println("\nVocê não tem direito ao Auxílio Emergencial.");
			
		}		
	}
}
