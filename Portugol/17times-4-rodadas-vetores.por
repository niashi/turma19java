programa
{
	
	funcao inicio()
	{
		// 4 rodadas de perguntas e, no fim, mostrar os resultados.

		
		cadeia times[] = {"PALMEIRAS", "SANTOS", "SPFC", "CORINTHIANS"}
		inteiro pontosPorTime[4]  
		caracter resultado

		para (inteiro rodada = 1; rodada <= 4; rodada++) {

			escreva("Rodada " + rodada + ".\n")
			
			para (inteiro x = 0; x < 4; x++) {
				
				escreva("O time " + times[x] + " ganhou, perdeu ou empatou? ")
				leia(resultado)

				se (resultado == 'g' ou resultado == 'G') {
					pontosPorTime[x] = pontosPorTime + 3
				} senao se (resultado == 'e' ou resultado == 'E') {
					pontosPorTime[x] += 1
				} senao se (resultado == 'p' ou resultado == 'P') {
					pontosPorTime[x] += 0
				} senao {
					escreva("O time receberá 0 pontos.")
				}
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
 * @POSICAO-CURSOR = 750; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */