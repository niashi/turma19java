package programas;

import java.util.Locale;
import java.util.Scanner;

public class ExemploPara {

	public static void main(String[] args) {
		
		/* 
			1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. 
			A prefeitura deseja saber:   
			a) média do salário da população; 
			b) média do número de filhos; 
			c) maior salário; 
			d) percentual de pessoas com salário até R$100,00.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		final double HABITANTES = 5;                   							// final: palavra reservada que indica constante.
		double salario = 0, maiorSalario = 0, somaSalario = 0, mediaSalario;
		int numeroFilhos = 0;
		double totalFilhos = 0, mediaFilhos;
		double percentualPessoasAte100 = 0;
		double contadorPessoasSalario100 = 0;
		
		for (int x = 1; x <= HABITANTES; x++) {
			System.out.println("• Habitante " + x + ":");
			System.out.print("\nPor favor, informe seu salário: R$");
			salario = leia.nextDouble();
			somaSalario += salario;
			
			if (salario <= 100) {
				contadorPessoasSalario100++;
			}
			
			if (salario > maiorSalario) {
				maiorSalario = salario;
			}
			
			System.out.print("Agora, informe quantos filhos você tem: ");
			numeroFilhos = leia.nextInt();
			totalFilhos += numeroFilhos;
			System.out.println();
		}
		
		mediaSalario = (somaSalario / HABITANTES);
		mediaFilhos = (totalFilhos / HABITANTES);
		percentualPessoasAte100 = (contadorPessoasSalario100 / HABITANTES) * 100;
		
		underline();
		System.out.printf("\n• A média do salário da população é de R$%.2f%s" , mediaSalario, ".");
		System.out.printf("\n• O maior salário observado é R$%.2f%s" , maiorSalario, ".");
		System.out.printf("\n• A média do número de filhos da população é %.1f%s" , mediaFilhos, ".");
		System.out.printf("\n• O percentual de pessoas com salário de até R$100,00 é de %.2f%s" , percentualPessoasAte100, "%.\n");
		overline();
	}
	
	public static void underline() {
		System.out.print("__________________________________________________________________");
	}
	
	public static void overline() {
		System.out.print("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
	}
}
