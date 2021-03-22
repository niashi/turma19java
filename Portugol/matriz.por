programa {
	
	funcao inicio() {
	
		cadeia agenda[24][31]
		inteiro dia, hora
		caracter opcao

		faca {
			escreva("Digite o dia do compromisso: ")
				leia(dia)
				dia--
			escreva("\nDigite a hora: ")
				leia(hora)
				escreva("\nDigite e informe o compromisso: ")
			leia(agenda[hora][dia])
				escreva("Deseja continuar? [S/N]")
				leia(opcao)

			se (opcao == 'N' ou opcao == 'n') {
				pare
			}
			
		} enquanto (verdadeiro)
		
		escreva("•AGENDA•\n")
		
		para (inteiro d = 0; d < 31; d++) {
			para (inteiro h = 0; h < 24; h++) {
				se (agenda[h][d] != "") {
					escreva("No dia " + dia + 1 + ", às " + h + "hora(s), seu compromisso é: \n" + agenda[h][d] + "\n")
				}		
			}
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 699; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */