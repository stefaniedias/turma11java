programa
{
	
	funcao inicio()
   {
       //variavel
		real P
		real M = 0
		real E = 0

		//Input
		escreva("Olá, informe o peso de tomates para o cálculo: ")
		leia(P)

		//Condição
		se (P > 50){
			E = P - 50
			M = E * 4
			escreva("\nO peso dos tomates excedeu em: ", E, " kilos sendo necessario pagar: R$ ", M, " reais")
		}
		senao{
			escreva("\nO peso dos tomates não excedeu !! \nPeso dos tomates: ", P, "\nTaxa de Excesso: ", E, "\nValor da Multa: ", M) )
		}

		
		}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */