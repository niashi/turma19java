package app;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Loja {

	public static void main(String[] args) throws InterruptedException {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
			
		System.out.println("          ╔                             ╗");
		System.out.print("          ║   Agiota Conveniência G7®   ║\n");
		System.out.print("	  ╚                             ╝\n");
		System.out.print("──────────────────────────────────────────────────");
		System.out.println("\n         Aqui, você não fica nos devendo...");
		Thread.sleep(2000);
		System.out.print("                   ( ಠ ʖ̯ ಠ )\n");
		System.out.println();
		System.out.println();
			
		Thread.sleep(2000);
		
		System.out.print("               Carregando sistema");

		String reticencias = "";
		
		for (int x = 0; x < 3; x++) {			
			for (int y = 0; y < 1; y++) {
				reticencias = ".";
				System.out.print(reticencias);
				reticencias += ".";
				Thread.sleep(2000);			
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("               [Sistema carregado]");
		Thread.sleep(2000);
		
		limpatela();
		
		int tipoProduto;
		
		do {
			System.out.print("\nDigite uma opção:\n\n1 - Bebidas\n2 - Salgadinhos\n3 - Doces\n4 - Gelo\n5 - Revistas\n6 - Sair\n");
			tipoProduto = leia.nextInt();
			
			if (tipoProduto < 1) {
				System.out.println("\nPor favor, insira uma opção válida");
			} else if (tipoProduto == 1) {
				System.out.println("\nOK");
			} else if (tipoProduto == 2) {
				
			} else if (tipoProduto == 3) {
				
			} else if (tipoProduto == 4) {
				
			} else if (tipoProduto == 5) {
				
			} else {
				
			}
			
		} while (tipoProduto != 6);		
	}

	public void limpatela() { 
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
	}

}
	
	
	

