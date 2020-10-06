programa
{
	
	funcao inicio()
	{
		//labore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
		
//fantil A = 5 a 7 anos
//antil B = 8 a 11 anos
//venil A = 12 a 13 anos
//venil B = 14 a 17 anos
//ultos = Maiores de 18 anos


		inteiro idade = 0
		
		escreva ("Digite o sua idade:")
		leia (idade)
		
		
		se (idade <0) {
			escreva("Idade inválida!")
			
		} senao se (idade> = 18) {
				escreva ("Sua idade é:" + idade + "! A sua categoria é Adulto")
		
		} senao se (idade> 13) {
				escreva ("Sua idade é:" + idade + "! A sua categoria é Juvenil B")
		} senao se (idade> 11) {
				escreva ("Sua idade é:" + idade + "! A sua categoria é Juvenil A")
		} senao se (idade> 7) {
				escreva ("Sua idade é:" + idade + "! A sua categoria é Infantil B")
		} senao se (idade> 7) {
				escreva ("Sua idade é:" + idade + "! A sua categoria é Infantil A") 
		} senao { 
			escreva("Sua idade é:" + idade + "Você é muito jovem para competir, mais alguns anos e você estará pronto!")
		}
		 		
		}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1016; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */