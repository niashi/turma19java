package lista3;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		// Prefeitura de uma cidade deseja saber, de 20 pessoas:
		// MÉDIA DO SALÁRIO, MÉDIA DE FILHOS, MAIOR SALÁRIO, PERCENTUAL DE PESSOAS COM
		//SALÁRIO DE ATÉ R$100,00.
		
		
		final double HABITANTES = 2;
		double salario, mediaSalarios, totalSalarios = 0.00, maiorSalario = 0.00, mediaNumeroFilhos, percentualPessoasAte100;
		int totalPessoasAte100 = 0, numeroFilhos, totalNumeroFilhos = 0;
		
		Scanner leia = new Scanner(System.in);	
		
		for (int x = 1; x <= HABITANTES; x++) {
			
			System.out.print("Digite o salário: R$ ");
			salario = leia.nextDouble();
			System.out.print("Digite o número de filhos: ");
			numeroFilhos = leia.nextInt();
			
			totalSalarios = totalSalarios + salario;
			totalNumeroFilhos = totalNumeroFilhos + numeroFilhos;
			
			if (maiorSalario < salario) {
				maiorSalario = salario;
			}
			
			if (salario <= 100) {
				totalPessoasAte100++;
			}
		}
		
		mediaSalarios = (totalSalarios / HABITANTES);
		mediaNumeroFilhos = (totalNumeroFilhos / HABITANTES);
		percentualPessoasAte100 = (totalPessoasAte100 / HABITANTES) * 100;
		
		linha();
		System.out.printf("A soma dos salários é R$ %.2f%s" , totalSalarios , ". \n");
		System.out.printf("A média dos salários é R$ %.2f%s" , mediaSalarios , ".\n");
		System.out.printf("O maior salário informado é de R$ %.2f%s" , maiorSalario , ". \n");
		System.out.printf("O percentual de pessoas com salário de até R$ 100,00 é de %.2f%s" , percentualPessoasAte100 , "%. \n");
		System.out.printf("O número de filhos é " + totalNumeroFilhos + ". \n");
		System.out.printf("A média dos filhos é " + mediaNumeroFilhos + ". \n");
		linha();
	}
	
	static void linha() {
		System.out.println("---------------------------------------------------");
	}
}
