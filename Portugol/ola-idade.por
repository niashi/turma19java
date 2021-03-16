programa {
	
	funcao inicio() {
		       

		cadeia nome								
		inteiro ano = 2021									
		inteiro nascimento						
		inteiro idade				
		
		
		escreva("Olá, qual é seu nome? ")
		leia(nome)
		escreva("E em que ano você nasceu? ")
		leia(nascimento)
		
		idade = (ano - nascimento) 
		
		escreva("Olá, " + nome + ", sua idade aproximada é " + idade + " ano(s).")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 293; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */