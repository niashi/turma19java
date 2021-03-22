programa {
	
	funcao inicio() {
		
		// Times de futebol
		// PALMEIRAS, SANTOS, SPFC, CORINTHIANS
		
		cadeia times[4]

		 // cadeia times[] = {"PALMEIRAS", "SANTOS", "SPFC", "CORINTHIANS"}
		// inteiro pontos[4]
		
		inteiro indice = 0

		times[0] = "PALMEIRAS"
		times[1] = "SANTOS"
		times[2] = "SPFC"
		times[3] = "CORINTHIANS"


		para (indice; indice < 4; indice++) {

			escreva("O time " + indice + " é o " + times[indice] + ".\n")
		}

		
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 133; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */