programa {
	
	funcao inicio() {
		
		// Auxílio Emergencial chegou. Toda pessoa cadastrada tem direito a R$ 600,00.
		// Se for chefa de família, recebe o dobro. Programa que pede o nome da pessoa e 
		// pergunta se é chefa de família ou não e informa quanto ela recebe.

		cadeia nome
		cadeia valor
		
		
		escreva("Olá, qual é seu nome? ")
		leia(nome)
		escreva("Você é uma chefa de família? Digite 1 se sim e 2 se não for: ")
		leia(valor)

		se (valor == "1") {
			escreva("Parabéns, " + nome + ", você tem direito de receber R$ 1200,00.")
		} senao se (valor == "2") {
			escreva("Olá, " + nome + ", seu benefício é de R$ 600,00.")
		} senao {
			escreva("Por favor, " + nome + ", digite 1 ou 2.")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 578; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */