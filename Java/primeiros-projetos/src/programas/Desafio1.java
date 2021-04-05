package programas;

import java.util.Scanner;

public class Desafio1 {
	
	public static void main(String[] args) {
		
		// Auxilio Emergencial: saber se a pessoa j� recebeu anteriormente. Se ela for chefa de fam�lia: tem direito ao dobro do valor. 
		// Sen�o, n�o tem. Informar se recebe outro aux�lio do governo. Se sim, n�o pode receber o novo aux�lio. R$ 300,00 � o b�sico. Se for chefa,
		// 600. A cada filho, a pessoa ganha R$ 50,00 a mais.
		
		
		char chefaFamilia, auxilioAnterior, outroBeneficio, temFilhos;
		double valorBeneficio = 300.00;
		int quantiaFilhos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Aux�lio Emergencial");
		System.out.print("\nVoc� j� recebe algum benef�cio do governo? [S/N] ");
		outroBeneficio = leia.nextLine().toUpperCase().charAt(0);
		if (outroBeneficio == 'N') {
			System.out.print("\nVoc� recebeu o Aux�lio Emergencial anteriormente? [S/N] ");
			auxilioAnterior = leia.nextLine().toUpperCase().charAt(0);
			
			if (auxilioAnterior == 'N') {
				System.out.print("\nVoc� n�o tem direito ao Aux�lio Emergencial");
			} else {
				System.out.print("\nVoc� � uma mulher chefa de fam�lia? [S/N] ");
				chefaFamilia = leia.nextLine().toUpperCase().charAt(0);
				
				if (chefaFamilia == 'S') {
					valorBeneficio *= 2;
					System.out.println("\nVoc� tem direito ao dobro do benef�cio.");
				}
				
				System.out.print("\nVoc� tem filhos? [S/N] ");
				temFilhos = leia.nextLine().toUpperCase().charAt(0);
				
				if (temFilhos == 'S') {
					System.out.println("\nQuantos filhos voc� tem?");
					quantiaFilhos = leia.nextInt();
					valorBeneficio = valorBeneficio + (quantiaFilhos * 50);
					System.out.println("\nO valor do seu benef�cio � de R$" + valorBeneficio);
				} else {
					System.out.println("\nVoc� n�o tem direito a valores adicionais por filho. O valor de seu aux�lio � de R$" + valorBeneficio + ".");
				}
			}						
		} else {
			valorBeneficio = 0;
			System.out.println("\nVoc� n�o tem direito ao Aux�lio Emergencial.");
			
		}		
	}
}
