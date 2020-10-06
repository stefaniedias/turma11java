programa
{
	
	/*
	 * Recebe um valor inteiro
	Verificar se o valor é maior que 0 ou 0
	Ela não faz em numero negativo
	se par mande mensagem
	se impar mande mensagem
	se zero avise que usuário digitou zero
	 */
	
	funcao inicio(){
	
	inteiro valorUsuario
	escreva("Digite o valor do usuario ")
	leia(valorUsuario)
	escreva(valorUsuario)

	parImpar(valorUsuario)
	}
	funcao parImpar(inteiro valorUsuario)
	{
		se (valorUsuario == 0) {
			escreva("O valor é igual a Zero")
		}
		senao se (valorUsuario <0) {
			escreva("\nO valor é negativo")
		}
		senao {
			escreva("\nO valor é positivo e diferente de zero")
			se (valorUsuario % 2 == 0) {
				escreva("\nOnúmero é par")
			}
			senao {
				escreva("\nO número é ímpar")
			}
		}
	}
	

	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 741; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */