package lista1;

import java.util.Scanner;

public class IdadeEmDias {

		public static void main(String[] args) {
			
			int anos, meses, dias, diasTotais;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Quantos anos voc� tem? ");
			anos = leia.nextInt();
			System.out.println("Quantos meses se passaram desde seu anivers�rio? ");
			meses = leia.nextInt();
			System.out.println("E quantos dias se passaram neste �ltimo m�s? ");
			dias = leia.nextInt();
			
			diasTotais = (anos * 365) + (meses * 30) + (dias);
					
			System.out.println("Voc� viveu " + diasTotais + " dias.");
		}
}
