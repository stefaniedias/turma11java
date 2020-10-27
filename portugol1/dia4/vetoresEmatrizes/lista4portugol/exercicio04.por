programa
{
	
	funcao inicio()
	{
		// variaveis e matrizes
		const inteiro LIMITELINHA = 3, LIMITECOLUNA = 3
		valores inteiros [LIMITELINHA] [LIMITECOLUNA])
		inteiro l = 0, c = 0, totalDiagonal = 0, totalMatriz = 0

		// laço da linha
		para (l = 0; l <LIMITELINHA; l ++) {
			// laço da coluna
			para (c = 0; c <LIMITECOLUNA; c ++) {
				// pergunta ao usuário para informar os valores das linhas e colunas
				escreva ("Digite o valor da linha", l, "e coluna", c, ":")
				leia (valores [l] [c])}


				// condicional para verificar se a linhas e colunas são iguais e assim calcular
				// o total da diagonal
				se (l == c) {
					totalDiagonal = totalDiagonal + valores [l] [c]
				}
				// cálculo da soma de todos os valores da matriz
				Matriz total = Matriz total + valores [l] [c]
			}
		}
		// saida implanta os cálculos e condionais
		escreva("\n nA soma da diagonal principal é: ", totalDiagonal)
		escreva("\n nA soma dos valores da matriz é: ", totalMatriz) 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 977; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */