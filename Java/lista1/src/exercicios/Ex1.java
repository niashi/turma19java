package exercicios;

import java.util.Scanner;

public class Ex1 {
	
		public static void main(String[] args) {
			
			// Sistema que l� a idade de uma pessoa em anos, meses e dias e a transforma para dias.
			
			
			int anos, meses, dias, diasTotais;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.print("Quantos anos voc� tem? ");
			anos = leia.nextInt();
			System.out.print("Quantos meses se passaram desde seu anivers�rio? ");
			meses = leia.nextInt();
			System.out.print("E quantos dias se passaram neste �ltimo m�s? ");
			dias = leia.nextInt();
			
			diasTotais = (anos * 365) + (meses * 30) + (dias);
					
			System.out.println("\nVoc� viveu " + diasTotais + " dias.");
		}
}