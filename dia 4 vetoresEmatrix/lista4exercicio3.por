programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
 * Escreve um programa que lê duas matrizes N1 (4,6) e N2 (4,6) e cria:
 Uma matriz M1 deve incluir elementos como somas dos elementos de mesma posição das matrizes N1 e N2;
 Uma matriz M2 considera elementos serão como diferenças dos elementos de mesma posição das matrizes N1 e N2.

 * 
 */


	{
		// Declaração de variável
		inteiro N1 [4] [6]
		inteiro N2 [4] [6]
		inteiro M1soma [4] [6]
		inteiro M2sub [4] [6]

		// Entrada, Processamento e Saída

		para (inteiro linha = 0; linha <4; linha = linha +1)
		{
			
			para (inteiro coluna = 0;coluna<6;coluna++)

		
			{
				// Eu insiro um número sorteado em N1, insiro um número sorteado em N2, insiro a soma dois números em M1soma e insiro a subtração no M2sub
			N1 [linha] [coluna] = Util.sorteia (1, 100)
			N2 [linha] [coluna] = Util.sorteia (1, 100)
			M1soma [linha] [coluna] = N1 [linha] [coluna] + N2 [linha] [coluna]
			M2sub [linha] [coluna] = N1 [linha] [coluna] - N2 [linha] [coluna]
			pula ()
			escreva ("O valor de N1 na posição [" + linha + "] [" + coluna + "] é de:" + N1 [linha] [coluna])
			pula ()
			escreva ("O valor de N2 na posição [" + linha + "] [" + coluna + "] é de:" + N2 [linha] [coluna])
			pula ()
			escreva ("O valor de M1 na posição" + "[" + linha + "] [" + coluna + "] é de:" + M1soma [linha] [coluna])
			pula ()
			escreva ("O valor de M2 ​​na posição [" + linha + "] [" + coluna + "] é de:" + M2sub [linha] [coluna])
			pula ()
			pula ()
			
			}
			pula ()
			pula ()
	}
}
	funcao pula () {
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1571; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */