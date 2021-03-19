programa
{
	
	funcao inicio()
	{
		// Imposto de Renda. Perguntar o salário bruto de uma pessoa, o nome dela e seu
		// gênero. Se for até R$ 1200,00, está isento ou isenta. Se for de R$ 1200,00 até 
		// R$ 2500,00, ela pagará 12% de imposto (mostrar salário líquido + valor do imposto).
		// Se o salário for maior que R$ 2500,00, a alíquota é 25% (mostrar salário líquido +
		// valor do imposto).

		cadeia nome
		cadeia genero
		cadeia tratamento
		real salarioTotal = 0.00

		escreva("Olá, qual é seu nome? ")
		leia(nome)
		escreva("Como devemos tratar você? Digite 1 para Senhor, 2 para Senhora 3 para Senhorx")
		leia(genero)
		escreva(nome + ", qual é seu salário? ")
		leia(salarioTotal)

		se (genero == "1") {
			tratamento = "Senhor"
		}






		se (salarioTotal < 1200) {
			escreva("Parabéns, " + nome + ", você é isento do Imposto de Renda.")
		} senao se (salarioTotal < 1200 e salarioTotal < 2500) {
			escreva(nome + ", sua alíquota é de 12%. Você pagará R$ " + (0.12 * salario) +
			" de impostos e seu salário líquido será de R$ " + (salario - (0.12 * salario)) +
			".")
		} senao se (salarioTotal > 2500) {
			escreva(nome + ", sua alíquota é de 12%. Você pagará R$ " + (0.12 * salario) +
			" de impostos e seu salário líquido será de R$ " + (salario - (0.12 * salario)) +
			".")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1128; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */