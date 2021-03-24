programa {
	
	funcao inicio() {
	
		inteiro valor = 100			   // O operador = atribui valores.
		inteiro mes = 0
		inteiro meses = 0
			
		se (valor == 2) {                  // O operador == compara valores.
			escreva("O valor é 2. \n")
		} senao {
			escreva("O valor não é 2, e sim " + valor + ".\n")
		}

		escreva("Digite um número inteiro entre 1 e 3: ")
		leia(mes)
		
		se (mes == 1) {
			escreva("Mês de janeiro. \n")
		} senao se (mes == 2) {
			escreva("Mês de fevereiro. \n")
		} senao se (mes == 3) {
			escreva("Mês de março. \n")
		} senao {							     // senao é a estrutura final
			se (mes == 0) {
				escreva("Você digitou 0. \n")	
			} 
			escreva("Não está entre 1 e 3.")
		}


		escreva("Digite mais um número inteiro entre 1 e 3: ")	
		leia(meses)
		se (meses == 1 ou meses == 2) {			// Operador ou: um OU outro.
			escreva("Ainda não é março. \n")
		} senao se (meses > 1 e meses > 2 ) {		// Operador e: um E outro.
			escreva("Já é março.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 938; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */