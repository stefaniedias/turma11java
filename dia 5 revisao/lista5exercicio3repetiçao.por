programa
{
	
	funcao inicio ()
	{
		
	     inteiro n = 1
	     inteiro i1 = 0
	     inteiro i2 = 0
	     inteiro i3 = 0 
	     inteiro i4 = 0

		
		enquanto (n > 0) {
			escreva("Digite um numero quantas vezes: ")
			leia(n)
			
			
			se ( (n >= 0 e n<= 25)) {
				i1 = i1 + 1
			}
			senao se (n> = 26 e n<= 50) {
				i2 = i2 + 1
			}
			senao se (n> = 51 e n<= 75) {
				i3 = i3 + 1
			}
			senao se (n> = 76 e n<= 100) {
				i4 = i4 + 1
			}
		}

	
		escreva("A quantidade de números entre 0-25 é:", i1, "\nde 26-50 é:", i2, "\nde 51-75 é:", 
		i3, "\nde 76-100 é:", i4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 579; 
 * @PONTOS-DE-PARADA = 16;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */