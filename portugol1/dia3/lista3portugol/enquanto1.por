programa
{
	
	funcao inicio()
	{
		
		 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e orientar 
		 no final o total do somatório, a média e o total de valores lidos. O programa deve fazer
		 como leituras dos valores enquanto o usuário estiver recebendo valores positivos. Ou seja,
		 o programa deve parar quando o usuário fornecer um valor negativo.
		 * /

		// variavel
		inteiro valor = 0, contador = 0 
		mídia real = 0, soma = 0


		// laço de repetição
		enquanto (valor> = 0) {

			// entrada
			escreva ("Insira um valor positivo:")
			leia (valor)

			// condicional
			se (valor> 0) {
				soma = soma + valor
				contador = contador + 1
				media = soma / contador
			}
		}

		// saida
		escreva ("\ nTotal do somatorio", soma, 
		"\ nA media é:", media, 
		"\ nTotal de valores lidos:", contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 840; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */