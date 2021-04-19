package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {
		
		// Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		// final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		// 0(zero).(DO...WHILE)
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int[10];
		String[] ordem = {"primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", "s�timo", "oitavo", "nono", "d�cimo"};
		int numero, x = 0;
		double media, somaMultiplos3 = 0;
		
		do {
			System.out.print("Insira o " + ordem[x] + " valor: ");
			numeros[x] = leia.nextInt();
			if ((numeros[x] % 3) == 0) {
				somaMultiplos3 += numeros[x];
			} else if (numeros[x] == 0) {
				break;
			}
			x++;
		} while (x < 10);
		
		media = (somaMultiplos3 / numeros.length);
		
		
		System.out.println(somaMultiplos3);
		System.out.println(numeros.length);
		System.out.println(media);
		System.out.printf("A m�dia dos n�meros m�ltiplos de tr�s � %.5f." , media);
	}
}
