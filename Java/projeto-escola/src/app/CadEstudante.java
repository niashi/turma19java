package app;

import java.util.Locale;
import java.util.Scanner;
import entities.Basico;
import entities.Estudante;
import entities.Medio;

public class CadEstudante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("ESCOLA VAI-QUEM-QUER");
		System.out.println("\nPor favor, escolha uma op��o: ");
		
		do {
			System.out.println("\n1 - Ensino B�sico \n2 - Ensino M�dio \n3 - Gradua��o \n4 - Mestrado \n5 - P�s \n6 - Sair");
			opcao = leia.nextInt();
			
			if (opcao < 1 || opcao > 6) {
				System.out.println("\nPor favor, digite uma op��o v�lida.");
			
			} else if (opcao == 1) {
				
				System.out.print("Digite a matr�cula do aluno: ");
				int matricula = leia.nextInt();
				System.out.print("Agora, digite o CPF: ");
				String cpf = leia.next();
				System.out.println("Digite seu dia de anivers�rio: ");
				int diaAniversario = leia.nextInt();
				
				Basico aluno = new Basico(cpf, matricula, diaAniversario);			// Inst�ncia do tipo Basico.
				
				System.out.println("Digite a nota: ");
				double nota = leia.nextDouble();
				aluno.adicionarPontos(nota);
				if (aluno.getPontos() <= 5) {
					System.out.println("Ainda n�o.");
				} else {
					System.out.println("Parab�ns.");
				}
				System.out.println("Que dia � hoje?");
				int diaAtual = leia.nextInt();
				aluno.bonusAniversario(diaAtual);
				System.out.printf("Pontos atuais: %s" , aluno.getPontos());
				System.out.println("Continua? [1/6]");
				opcao = leia.nextInt();				
			} else if (opcao == 2) {
				
				System.out.print("Digite a matr�cula do aluno: ");
				int matricula = leia.nextInt();
				System.out.print("Agora, digite o CPF: ");
				String cpf = leia.next();
				
				Medio aluno = new Medio(cpf, matricula);							// Inst�ncia do tipo Medio.
							
				System.out.println("Digite a nota: ");
				double nota = leia.nextDouble();
				
				aluno.adicionarPontos(nota);
				
				if (aluno.getPontos() <= 5) {
					System.out.println("Ainda n�o.");
				} else {
					System.out.println("Parab�ns.");
				}
				
				aluno.imprimirBoletim();
				System.out.println("Continua? [1/6]");
				opcao = leia.nextInt();	
			}
		} while (opcao != 6);
	}	
}

	
	

