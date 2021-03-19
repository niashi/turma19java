programa {
	
		// Programa que transforma o código de Celsius -> Fahrenheit em uma função que
		// retorna o valor em Fahrenheit para o programa.

	inclua biblioteca Matematica

		
	funcao inicio() {
		
		// Programa que transforma o código de Celsius -> Fahrenheit em uma função que
		// retorna o valor em Fahrenheit para o programa.

		cadeia nome
		real temperaturaFahrenheit
		real temperaturaCelsius

		escreva("Oi, qual é seu nome? ")
		leia(nome)
		escreva("E qual a temperatura em graus Celsius? ")
		leia(temperaturaCelsius)
 		escreva("Oi, " + nome + ", a temperatura é de " + 
		Matematica.arredondar(celsiusFahrenheit(temperaturaCelsius), 1) + " graus Fahrenheit.")

	}

	funcao real celsiusFahrenheit (real temperaturaCelsius) {

		real fahrenheit
		
		fahrenheit = (1.8 * temperaturaCelsius) + 32

		retorne fahrenheit
 
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 655; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */