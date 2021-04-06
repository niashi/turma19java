package programas;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		/* Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = new String[3];      // Decalrando um vetor de 3 posições.
		
		nomes[0] = "Maria Júlia";
		nomes[1] = "Jaqueline";
		nomes[2] = "Mathias";
		
		for (int x = 0; x < nomes.length; x++) {
			System.out.println(nomes[x]); */
		
		// Perguntar o nome de 4 pessoas e também a nota. Depois, mostrar nome e nota e, se a pessoa tiver tirado até 5, escrever "ainda não"
		// e, caso seja acima de 5, escrever "muito bem".
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = new String[4];
		double notas[] = new double[4];
		
		for (int x = 1; x <= 4; x++) {
			System.out.println("Pessoa " + x + ":\n");
			System.out.print("Por favor, informe seu nome: ");
			nomes[x-1] = leia.next();
			System.out.print("Por favor, insira sua nota: ");
			notas[x-1] = leia.nextDouble();
			System.out.println("\n" + nomes[x-1] + " - " + notas[x-1] + "\n");
			if (notas[x-1] <= 5) {
				System.out.println("Ainda não =/ \n");
				underline();				
			} else {
				System.out.println("Muito bem! =)");
				underline();
			}
 		}
		
		}
	
	public static void underline() {
		System.out.println("________________________________");
	}
}
