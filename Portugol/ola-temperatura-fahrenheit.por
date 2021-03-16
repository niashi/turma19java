programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		// Situação: você recebe um amigo norte-americano e é verão. Ele vê 32ºC
		// e não entende, porque usa Farenheit. Pedir o NOME da pessoa, a TEMPERATURA em 
		// farenheit e informar a temperatura em celsius.

		cadeia nome
		real temperaturaFahrenheit
		real temperaturaCelsius

		escreva("Oi, qual é seu nome? ")
		leia(nome)
		escreva("E qual a temperatura em graus Celsius? ")
		leia(temperaturaCelsius)

		temperaturaFahrenheit = (1.8 * temperaturaCelsius) + 32

		escreva("Oi, " + nome + ", a temperatura é de " + 
		Matematica.arredondar(temperaturaFahrenheit, 2) + " graus Fahrenheit.") 

		// A função arrendondar, da biblioteca matemática, toma um valor como primeiro
		// parâmetro e, como segundo parâmetro, o número de casas para arredondamento.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */