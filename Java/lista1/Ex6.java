package lista1;

import java.util.Scanner;
import java.lang.Math;

public class Ex6 {

	public static void main(String[] args) {
		
		// Programa que escreve a distância entre 2 pontos.
		
		
		int x1, x2, y1, y2;
		double d;
		
		Scanner leia = new Scanner(System.in);

		System.out.print("Insira o valor x do primeiro ponto: ");
		x1 = leia.nextInt();
		System.out.print("Insira o valor y do primeiro ponto: ");
		y1 = leia.nextInt();
		System.out.print("Insira o valor x do segundo ponto: ");
		x2 = leia.nextInt();
		System.out.print("Insira o valor y do segundo ponto: ");
		y2 = leia.nextInt();

		d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) );
				
		System.out.printf("\nO valor de d é %.2f%s" , d , ".");
		
	}
}
