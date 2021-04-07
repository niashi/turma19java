package lista6;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String[] ordem = {"Primeiro", "Segundo", "Terceiro", "Quarto", "Quinto", "Sexto", "Sétimo", "Oitavo", "Nono", "Décimo"};
		int[] numeros = new int[10];
		int quantiaPares = 0, quantiaImpares = 0;
		int[] vetorPares = new int[10];
		int[] vetorImpares = new int[10];
		
		System.out.println("• Informar 10 números inteiros e positivos: \n");
		
		for (int x = 0; x < ordem.length; x++) {
			System.out.print(ordem[x] + " número: ");
			numeros[x] = leia.nextInt();
			if (numeros[x] < 0) {
				System.out.println("\nValor desconsiderado por ser negativo. Por favor, insira novamente os dados.\n");
				System.exit(1);
			}
		}
		
		for (int x = 0; x < numeros.length; x++) {
			if((numeros[x] % 2) == 0) {
				quantiaPares++;
				vetorPares[x] = numeros[x];
			} else {
				quantiaImpares++;
				vetorImpares[x] = numeros[x];
			}
		}
		System.out.printf("\nTem-se %d números pares e %d números ímpares." , quantiaPares , quantiaImpares);
	}
}
