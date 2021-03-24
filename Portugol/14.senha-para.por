programa {
	
	funcao inicio() {

		cadeia senha
		
		para (inteiro x = 0; x < 3; x++) {       // Enquanto a variável x for menor que 3, começando em 0 e adicionando
									      // uma unidade a cada iteração, o que estiver dentro do escopo do
									      // "para" ocorrerá.

			escreva("Digite a senha: ")
			leia(senha)
			
			se (senha == "123") {
				escreva("Senha correta.")
				pare
			} senao {
				escreva("Senha incorreta. ")
			}
		}


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */