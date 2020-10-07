programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		const inteiro LIMITE=4
		cadeia produtos[] = {"Camisa","Calça","Camiseta","Vestido"}
		real precos[] = {100.00, 300.50, 90.75, 250.00}
		inteiro x
		real precoOriginal = 0.0, resultado = 0.0, calculo = 0.0
		inteiro pgto = 0
		
		para (x = 0; x<LIMITE;x++)
		{
			escreva("Codigo produto ",x+1," ",produtos[x],"  R$ ",precos[x])
			pulalinha()
		}
		escreva("Vai compra o que? Digite o codigo do produto:")
		leia(codigo)
		codigo= codigo-1
		pulalinha()
		escreva("Vc escolheu ",produtos[codigo]," no valor de ", precos[codigo])
		pulalinha()
		escreva("Vai pagar como:\n")
		escreva("1 À vista em dinheiro ou cheque, recebe 20% de desconto \n")
		escreva("2 À vista no cartão de crédito, recebe 15% de desconto \n")
		escreva("3 Em duas vezes, preço normal de etiqueta sem juros \n")
		escreva("4 Em três vezes, preço normal de etiqueta mais juros de 10%\n")
		escreva("Digite o numero da opcao:")
		leia(pgto)
		
	}
	funcao pulalinha()
	{
		escreva("\n")


		calculo = (20 *precoOriginal) / 100
			resultado = precoOriginal - calculo
			escreva ("Você escolheu a condição de pagamento", condicaoPagamento, "e com 20% de desconto seu produto tem um total de:", mat.arredondar (resultado, 3))
		}
		senao se (condicaoPagamento == 2) {
			calculo = (15 * precoOriginal) / 100
			resultado = precoOriginal - calculo
			escreva ("Você escolheu a condição de pagamento", condicaoPagamento, "e com 15% de desconto seu produto tem um total de:", mat.arredondar (resultado, 3))
		}
		
		senao se (condicaoPagamento == 3) {
			resultado = precoOriginal / 2
			escreva ("Você escolhe a condição de pagamento", condicaoPagamento, "parcelando seu produto em 2 vezes tendo um total de cada parcela de:", mat.arredondar (resultado, 3))
		}
		senao se (condicaoPagamento == 4) {
			calculo = (10 * precoOriginal) / 100
			resultado = (precoOriginal / 3) + calculo
			escreva ("Você escolhe a condição de pagamento", condicaoPagamento, "parcelando seu produto em 3 vezes tendo um total de cada parcela de:", mat.arredondar (resultado, 3))
		}
	}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */