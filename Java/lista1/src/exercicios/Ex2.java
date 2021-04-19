package exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		// Sistema que lê a idade de uma pessoa em dias e a mostra em anos, meses e dias.
		
		
		int idadeDias, dias, diasEmAnos, diasEmMeses;

		Scanner leia = new Scanner(System.in);
		
		System.out.print("Quantos dias você viveu até agora? ");
		idadeDias = leia.nextInt();

		diasEmAnos = idadeDias / 365;
		diasEmMeses = (idadeDias % 365) / 30;
		dias = (idadeDias % 365) % 30;
		

		System.out.print("Anos: " + diasEmAnos + ".");
		System.out.print("\nMeses: " + diasEmMeses + ".");
		System.out.print("\nDias: " + dias + ".");
	}
}
