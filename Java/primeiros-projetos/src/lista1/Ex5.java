package lista1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
			
		 	// Sistema que lê 3 notas de um aluno e calcula a média final ponderada, sendo os pesos das notas, respectivamente, 2, 3 e 5.
		
			double nota1, nota2, nota3, mediaFinal;
			
			Scanner leia = new Scanner(System.in);
				
			System.out.print("Adicione a primeira nota: ");
			nota1 = leia.nextDouble();
			System.out.print("Adicione a segunda nota: ");
			nota2 = leia.nextDouble();
			System.out.print("Adicione a terceira nota: ");
			nota3 = leia.nextDouble();

				
			mediaFinal = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10);

			System.out.println("\nSua Média Final é " + mediaFinal + ".");
		}
	}
