package lista3;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		// Prefeitura de uma cidade deseja saber, de 20 pessoas:
		// M�DIA DO SAL�RIO, M�DIA DE FILHOS, MAIOR SAL�RIO, PERCENTUAL DE PESSOAS COM
		//SAL�RIO DE AT� R$100,00.
		
		
		final double HABITANTES = 2;
		double salario, mediaSalarios, totalSalarios = 0.00, maiorSalario = 0.00, mediaNumeroFilhos, percentualPessoasAte100;
		int totalPessoasAte100 = 0, numeroFilhos, totalNumeroFilhos = 0;
		
		Scanner leia = new Scanner(System.in);	
		
		for (int x = 1; x <= HABITANTES; x++) {
			
			System.out.print("Digite o sal�rio: R$ ");
			salario = leia.nextDouble();
			System.out.print("Digite o n�mero de filhos: ");
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
		System.out.printf("A soma dos sal�rios � R$ %.2f%s" , totalSalarios , ". \n");
		System.out.printf("A m�dia dos sal�rios � R$ %.2f%s" , mediaSalarios , ".\n");
		System.out.printf("O maior sal�rio informado � de R$ %.2f%s" , maiorSalario , ". \n");
		System.out.printf("O percentual de pessoas com sal�rio de at� R$ 100,00 � de %.2f%s" , percentualPessoasAte100 , "%. \n");
		System.out.printf("O n�mero de filhos � " + totalNumeroFilhos + ". \n");
		System.out.printf("A m�dia dos filhos � " + mediaNumeroFilhos + ". \n");
		linha();
	}
	
	static void linha() {
		System.out.println("---------------------------------------------------");
	}
}
