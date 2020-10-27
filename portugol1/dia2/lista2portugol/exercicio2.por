programa
{
	
	funcao inicio()
	{
		// declaração de variáveis

		inteiro C = 0 // código
		inteiro valorHora = 10 // Até 50 horas
		inteiro valorHoraExcesso = 20
		pagamento real = 0 // soma do salarioToTal e do salarioExcedente
		real salarioTotal = 0 // salario total até 50 horas
		real E = 0 // valor cobrado pelas horas extras
		real N = 0 // número de horas trabalhadas


		// entrada de dados
		escreva ("Digite a quantidade de horas de trabalho:")
		leia (N)
		escreva ("Digite o número do código:")
		leia (C)




		// Processamento
		salarioTotal = 50 * valorHora

		se (N> 50) {
			E = (N -50) * valorHoraExcesso 
			}

			pagamento = salarioTotal + E
		// Saída
		escrever ("O código de código:" + C + "trabalhar" + N + "horas" + "o total regular é de:" + salarioTotal + "O pagamento de hora extra de trabalho foi de:" + E + "O pagamento final foi de: "+ pagamento)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 878; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */