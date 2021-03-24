programa {					// Palavras reservadas em vermelho
	
	funcao inicio() {			// Todo programa começa com a palavra programa +
							// funcao inicio(). O código deve estar dentro da
							// funcao inicio().
							
							// Todo programa tem: 
							// Objetivo
							// Início
							// Fim

		escreva("Papitow \n")    // Escreve, no console, tudo que estiver dentro dos
		                         // parênteses.

		inteiro numero1
		inteiro numero2		// Declarando variáveis do tipo inteiro (conjunto
							// dos inteiros).
		inteiro multiplicar
		inteiro dividir

		numero1 = 1000			// Definindo as variáveis, inclusive a soma.
		numero2 = 30
		multiplicar = numero1 * numero2
		dividir = numero1 / numero2

		escreva ("O valor da multiplicação é: " + multiplicar + ".")
		escreva("\n")
		escreva("O valor da divisão é: " + dividir + "." + "\n")



		inteiro numero3 
		inteiro numero4 
		
		escreva("Digite o primeiro número: ")        // Texto fica em amarelo.
		
		leia(numero3)							// O comando leia() aceita
											// input do usuário e o coloca
											// dentro da variável dentro
											// dos parênteses.
		escreva("Digite o segundo número: ")
		leia(numero4)

		escreva("A soma é " + (numero3 + numero4) + "\n")




		cadeia nome
		                        					// camelCase: escrever a 
											// 1ª letra da 1ª palavra com
		inteiro valorPrimeiro					// minúsculo e, a partir da 
											// próxima, com maiúsculo.  
		
		inteiro valorSegundo
		inteiro total

		escreva("Digite o nome: ")
		leia(nome)
		escreva("Digite o primeiro número: ")
		leia(valorPrimeiro)
		escreva("Digite o segundo número: ")
		leia(valorSegundo)

		total = (valorPrimeiro + valorSegundo)
		
		escreva("Olá, " + nome + ", a soma de " + valorPrimeiro + " e " + valorSegundo +
		" é igual a " + total + "." )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1807; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */