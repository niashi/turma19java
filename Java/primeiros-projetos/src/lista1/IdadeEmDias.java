package lista1;

import java.util.Scanner;

public class IdadeEmDias {

		public static void main(String[] args) {
			
			int anos, meses, dias, diasTotais;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Quantos anos você tem? ");
			anos = leia.nextInt();
			System.out.println("Quantos meses se passaram desde seu aniversário? ");
			meses = leia.nextInt();
			System.out.println("E quantos dias se passaram neste último mês? ");
			dias = leia.nextInt();
			
			diasTotais = (anos * 365) + (meses * 30) + (dias);
					
			System.out.println("Você viveu " + diasTotais + " dias.");
		}
}
