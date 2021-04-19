package exercicios;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		// Sistema que l� o dtempo de dura��o de um evento em segundos e o transforma em horas, minutos e segundos.
		
		
		double tempoTotalSegundos, horas, minutos, segundos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Quanto tempo dura o evento, em segundos? ");		
		tempoTotalSegundos = leia.nextDouble();
		
		horas = (tempoTotalSegundos / 3600);
		minutos = ((tempoTotalSegundos % 3600) / 60);
		segundos = ((tempoTotalSegundos % 3600) % 60);
		
		
		
		System.out.printf("Horas: %.0f" , horas);      	// %f: double. (%f.2: formata com 2 casa decimais ap�s a v�rgula).
															// OBS.: Nesse caso, usar a v�rgula para concatena��o.
		
		System.out.printf("\nMinutos: %.0f" , minutos);
		
		System.out.printf("\nSegundos: %.0f" , segundos);
	}															
}
