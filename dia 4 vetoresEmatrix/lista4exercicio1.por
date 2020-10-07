programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
 * 
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente.

 * 
 */
		//Declaração de variáveis
		const inteiro LIMITE = 5
		inteiro valoresDado[LIMITE]
		inteiro maiorNumero = 0
		
		escreva("Sorteando valores")
		pula()
		// Nesse "para eu vou olhar para cada posição do vetor criado e vou inserir um valor sorteado nele"
		para (inteiro x = 0 ; x < LIMITE; x++) 
		{
			valoresDado[x] = Util.sorteia(1, 10)
			// Aqui nesse "se" a cada valor inserido no valor eu comparo com a variável maiorNumero, se por acaso o numero for maior  é só eu colocar esse valor na variável como sendo esse o novo maiorNumero
			se(valoresDado[x] > maiorNumero)
			{
				maiorNumero = valoresDado[x]
			}
			//Saída
			escreva("O pontuação ",(x+1), " foi ",valoresDado[x])
			pula()
		}	
		
		//Saída
		escreva("A maior pontuação foi: " + maiorNumero)
		pula()
		
		
	}
	funcao pula(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1060; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */