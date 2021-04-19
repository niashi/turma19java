package lista6;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		/* Uma empresa desenvolveu uma pesquisa para saber as características
			psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
			era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
			(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
			agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
			pessoas, calcule e mostre: (WHILE)
			- o número de pessoas calmas;
			- o número de mulheres nervosas;
			- o número de homens agressivos;
			- o número de outros calmos;
			- o número de pessoas nervosas com mais de 40 anos;
			- o número de pessoas calmas com menos de 18 anos.
		 */
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		menu();

	}
	public static void menu() {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int idade, sexo, opcao, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0;
		int contadorDeErros = 0;
		final int PUBLICO = 2;
		char pergunta;
		int maior40 = 0, menor18 = 0;
		
		System.out.print("Pesquisa psicológica. Deseja iniciar? [S/N] ");
		pergunta = leia.next().toUpperCase().charAt(0); 
		
		while (pergunta == 'S') {
			
			for (int x = 0; x < PUBLICO; x++) {
				System.out.printf("\nEntrevistado %d\n" , (x + 1));
				System.out.print("\nQual é sua idade? ");
				idade = leia.nextInt();
				if (idade <= 0) {
					System.out.println("Opção inválida. Após esta rodada, você deverá reiniciar as perguntas.");
					x--;
					contadorDeErros++;
				}
				underline();
				System.out.print("\nE qual seu sexo? \n1 - Masculino \n2 - Feminino \n3 - Outro \n");
				sexo = leia.nextInt();
				underline();
				if (sexo < 1 || sexo > 3) {
					System.out.println("\nOpção inválida. Após esta rodada, você deverá reiniciar as perguntas.\n");
					if (contadorDeErros == 0) {
						x--;
						contadorDeErros++;						
					}
				}
				System.out.print("\nVocê se considera uma pessoa uma pessoa: \n1 - Calma \n2 - Nervosa \n3 - Agressiva \n");
				opcao = leia.nextInt();
				underline();
				
				if (opcao < 1 || opcao > 3) {
					System.out.println("\nOpção inválida. Após esta rodada, você deverá reiniciar as perguntas.\n");
					if (contadorDeErros == 0) {
						x--;
					}
				} 
				if (opcao == 1) {
					pessoasCalmas++;
				}
				if (sexo == 1 && opcao == 3) {
					homensAgressivos++;
				} 
				if (sexo == 2 && opcao == 2) {
					mulheresNervosas++;
				} 
				if (sexo == 3 && opcao == 1) {
					outrosCalmos++;
				} 
				if (opcao == 2 && idade > 40) {
					maior40++;
				} 
				if (opcao == 1 && idade < 18) {
					menor18++;
				}
			} 
			System.out.print("Deseja participar novamente da pesquisa novamente? [S/N] ");
			pergunta = leia.next().toUpperCase().charAt(0);
		}
		
		System.out.printf("Há %d pessoa(s) calma(s)." , pessoasCalmas);
		System.out.printf("Há %d mulhere(s) nervosa(s)." , mulheresNervosas);
		System.out.printf("Há %d homen(s) agressivo(s)." , homensAgressivos);
		System.out.printf("Há %d outro(s) calmo(s)." , outrosCalmos);
		System.out.printf("Há %d pessoa(s) nervosa(s) com mais de 40 anos." , maior40);
		System.out.printf("Há %d pessoa(s) calma(s) com menos de 18 anos." , menor18);		
	}
	
	public static void underline() {
		System.out.println("________________________________________________");
	}
	
	public static void overline() {
		System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
	}
	
}

