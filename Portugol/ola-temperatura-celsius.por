programa
{
	inclua biblioteca Matematica --> Mat     // "Apelido" para chamar a biblioteca.
	
	funcao inicio() {
		// Estou indo para os EUA e tudo lá está em Fahrenheit. Dada uma temperatura
		// em Fahrenheit, descobrir sua correspondente em Celsius. variáveis: 
		// NOME, TEMPERATURA EM FAHRENHEIT e escrever a temperatura em Celsius.
	 

		cadeia nome
		real temperaturaCelsius
		real temperaturaFahrenheit
		
		
		escreva("Oi, qual é seu nome? ")
		leia(nome)
		escreva("E qual a temperatura em graus Fahrenheit? ")
		leia(temperaturaFahrenheit)

		temperaturaCelsius = Mat.arredondar(((temperaturaFahrenheit - 32) / 1.8), 2)

		escreva("Oi, " + nome + ", a temperatura é de " + 
		temperaturaCelsius + " ºC.") 
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 92; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */