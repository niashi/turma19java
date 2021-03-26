package lista1;

import java.util.Scanner;

public class Ex7 {
	
	public static void main(String[] args) {
		
		// Sistema que lê valores e descobre x e y com base neles.
		
		int a, b, c, d, e, f;
		double x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe um valor para a: ");
		a = leia.nextInt();
		System.out.print("Informe um valor para b: ");
		b = leia.nextInt();
		System.out.print("Informe um valor para c: ");
		c = leia.nextInt();
		System.out.print("Informe um valor para d: ");
		d = leia.nextInt();
		System.out.print("Informe um valor para e: ");
		e = leia.nextInt();
		System.out.print("Informe um valor para f: ");
		f = leia.nextInt();
			
		x = (((c * e) - (b * f)) / ((a * e) - (b * d)));
		y = (((a * f) - (c * d)) / ((a * e) - (b * d)));

		System.out.println("\nO resultado de x é. " + x + ".");
		System.out.println("O resultado de y é " + y + ".\n");
	}
}
