package testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {
		
		Collection<String> nomes = new ArrayList<>();
		
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Maju");
		
		/*Collection<String> nomes2 = Arrays.asList("Maju", "Joana");
		nomes.addAll(nomes2);
		
		System.out.println(nomes);
		*/
		for (String x : nomes) {
			System.out.println(x);
		}
		
		
		/*System.out.print("Lista de nomes: " + nomes);

		System.out.println("\nContém o nome Maju? " + nomes.contains("Maju"));
		
		System.out.println("Lista: " + nomes);
		
		nomes.remove("Maria");
		nomes.remove("Mario");
		
		if (nomes.isEmpty()) {
			System.out.print("\nVazio");
		} else {
			System.out.print("\nLista de nomes: " + nomes);
		}*/
	}
}
