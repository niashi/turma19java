programa {
	
	funcao inicio() {
	
		// Criar programa que lê um número inteiro positivo que o usuário digitar. 
		// O númeroé par ou ímpar?


		inteiro numero = 0
		
		escreva("Insira um número inteiro e positivo: ")
		leia(numero)

		se (numero == 0) {
			escreva("Há divergências quanto à paridade do número 0.")
		} senao se (numero < 0) {
			escreva("Números negativos não têm paridade. \n")
		} senao se (numero % 2 == 0) {
			escreva("O número é par. \n")
		} senao {
			escreva("O número é ímpar. \n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 401; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */