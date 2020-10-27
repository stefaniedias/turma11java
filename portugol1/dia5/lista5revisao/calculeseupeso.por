programa
{
	
	funcao inicio()
	{
		real altura + 0
		real altura = 0
		real imc = 0


		escreva ("informe seu peso:")
		leia(peso)
		escreva("s/n")
		escreva ("Agora sua altura:")
		leia(altura)


		imc = (peso / (altura * altura))


		se (imc=<18,5) {
			escreva ("Seu IMC deu:", mat.arredondar (imc, 2), "e você está ABAIXO DO PESO")
		}
		senao se (imc> = 18,5 e imc <= 25,0) {
			escreva ("Seu IMC deu:", mat.arredondar (imc, 2), "e você possui um PESO IDEAL")
		}
		senao se (imc> = 25,0 e imc <= 30,0) {
			escreva ("Seu IMC deu:", mat.arredondar (imc, 2), "e você está ACIMA DO PESO")
		}
		senao se (imc> 30,0) {
			escreva ("Seu IMC deu:", mat.arredondar (imc, 2), "e você está OBESO")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 699; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */