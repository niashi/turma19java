package testes;

import java.util.ArrayList;
import java.util.List;

public class TesteVetorLista {
	public static void main(String[] args) {
	
		// String nomeTimes[] = {"Palmeiras", "Santos", "SPFC"};
		
		// nomeTimes
		
		List<String> times = new ArrayList<>();
		 
		times.add("Palmeiras"); 
		times.add("Santos");
		times.add("SPFC");
		
		System.out.println(times + "\n");
		
		times.remove("Palmeiras");
		
		for (String time: times) {
			System.out.println(time);
		}
	}
}
