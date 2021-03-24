programa
{
	
	funcao inicio()
	{
		// Criar um vetor para os times e para os pontos. Fazer com que cada time receba pontos.
		// G - Ganhou 3 pontos. E - empatou, 1 ponto. P - perdeu, 0 ponto.
		// O [nomeTime] G, P ou E (usuário digita G, P ou E e é colocado dentro do vetor, na posição do time, o 
		// número de ponto.

		// "O Palmeiras ganhou, perdeu ou empatou?" (P) Então Palmeiras = 0.
		// "O SPFC ganhou, perdeu ou empatou?" (G) Então SPFC = 3.

		// No fim, mostrar o nome do time e os pontos que ele tem.


		cadeia times[] = {"PALMEIRAS", "SANTOS", "SPFC", "CORINTHIANS"}
		inteiro pontosPorTime[4]
		caracter resultado
		
		para (inteiro x = 0; x < 4; x++) {
			escreva("O time " + times[x] + " ganhou, perdeu ou empatou? ")
			leia(resultado)

			se (resultado == 'g' ou resultado == 'G') {
				pontosPorTime[x] = 3
			} senao se (resultado == 'e' ou resultado == 'E') {
				pontosPorTime[x] = 1
			} senao se (resultado == 'p' ou resultado == 'P') {
				pontosPorTime[x] = 0
			}
		}

		escreva("\n•Resultados• \n")
		
		para (inteiro x = 0; x < 4; x++) {
				escreva("\n" + times[x] + ": " + pontosPorTime[x] + " ponto(s).")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1110; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */