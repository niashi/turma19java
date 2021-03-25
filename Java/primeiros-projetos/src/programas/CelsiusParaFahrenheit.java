package programas;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

	public static void main(String[] args) {
		
		double temperaturaCelsius;
		double temperaturaFahrenheit;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura em Celsius: ");
		temperaturaCelsius = leia.nextDouble();
		
		temperaturaFahrenheit = (1.8 * temperaturaCelsius) + 32;
	
		System.out.printf("A temperatura em Fahrenheit é " + temperaturaFahrenheit);
	}
}
