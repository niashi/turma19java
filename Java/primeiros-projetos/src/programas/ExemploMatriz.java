package programas;

import java.util.Locale;
import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int matrizQuadrada[][] = new int[3][3];
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Digite o valor na linha %d coluna %d:" , linha, coluna );
				matrizQuadrada[linha][coluna] = leia.nextInt();
			}
		}
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(matrizQuadrada[linha][coluna]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
