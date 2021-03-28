package lista2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		// Elaborar sistema que classifique um nadador segundo as categorias INFANTIL A (5 a 7 anos), INFANTIL B (8 a 		 
		// 11 anos), JUVENIL A (12 a 13 anos), JUVENIL B (14 a 17 anos) e ADULTOS (maior de 18 anos).
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Olá, nadador, qual é a sua idade? ");
		idade = leia.nextInt();
		
		if (idade <= 0) {
			System.out.println("\nPor favor, insira uma idade válida.\n");
		} else if (idade > 0 && idade < 5) {
			System.out.println("\nDesculpe, mas você ainda é muito pequeno! Volte quando for mais velho.\n");
		} else if (idade >= 5 && idade <= 7) {
			System.out.println("\nVocê faz parte da categoria INFANTIL A.\n");
		} else if (idade > 7 && idade <= 11) {
			System.out.println("\nVocê faz parte da categoria INFANTIL B.\n");
		} else if (idade > 11 && idade <= 13) {
			System.out.println("\nVocê faz parte da categoria JUVENIL A.\n");
		} else if (idade > 13 && idade <= 17) {
			System.out.println("\nVocê faz parte da categoria JUVENIL B.\n");
		} else {
			System.out.println("\nVocê faz parte da categoria ADULTOS.\n");
		}
		
	}
}
