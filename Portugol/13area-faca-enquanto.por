programa {
	
    funcao inicio() {
    	
		real aresta, area

		faca {                            			// Neste laço, o que estiver dentro do escopo do "faca" sempre
											// acontecerá primeiro caso a condição do "enquanto" for suprida.
			escreva ("Informe o valor da aresta: ")
			leia (aresta)
		} enquanto (aresta <= 0)

		area = aresta * aresta
		escreva("A área é: ", area)
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */