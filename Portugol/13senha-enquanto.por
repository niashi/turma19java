programa {
	
	funcao inicio() {

		cadeia senha = "123"
		inteiro contador = 1
		const inteiro LIMITESENHA = 3

		escreva("Digite a senha: ")
		leia(senha)
		
		enquanto (senha != "123") {                  // Enquanto alguma condição for válida, o que houver dentro
											// do escopo ocorrerá.
			     
			se (contador == LIMITESENHA) {
				escreva("Senha bloqueada por excesso de tentativas.")
				pare
			} 
			
			escreva("Senha incorreta. Tente novamente.")
			leia(senha)
			            
			
			contador++               // Contador = contador + 1, ou seja, a variável recebe o valor dela + 1.
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 304; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */