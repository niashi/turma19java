programa {
	
	funcao inicio() {

		inteiro numero
		linha()				// Chamando a função linha() declarada separadamente abaixo da função inicio().
		pula()				// Chamando a função pula().
		escreva("Digite um número inteiro positivo: ")
		leia(numero)
		linha()
		pula()
		parImpar(numero)
		pula()
		linha()
	}
	

	funcao parImpar (inteiro numero) {
		
		se ((numero % 2) == 0) {
			escreva("O número é par.")
		} senao {
			escreva("O número é ímpar.")
		}
	}

	funcao linha() {
		
		escreva("----------------------------------")
	}

	funcao pula() {
	
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */