programa
{
	
	funcao inicio()
	{
		
		/*
		 Faça um programa que pegue um número do teclado e calcule soma de todos os números  
		 de 1 até ele. Ex .: o usuário entra 7, o programa vai mostrar 28, pois 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28.
		 */

		// variavel
		inteiro n, contador = 0, soma = 0

		//entrada
		escreva("Digite um numero:")
		leia(n)

		// repetiçao
		faca {

			// processamento
			contador = contador + 1
			soma = soma + contador
			
			} enquanto (contador <n) {
				// saida
				escreva (soma, "\ n")
			}

			
		}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */