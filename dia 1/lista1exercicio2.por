programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 


       inteiro anos = 0
       inteiro meses = 0
       inteiro dias = 0
       inteiro tempo = 0

       escreva("digite digite sua idade em dias: ")
       leia(dias)
       
anos = tempo/365
meses = (tempo%365)/30
dias= (tempo%365)%30

escreva("anos: " + anos, "\nmeses: " + meses
        +"\ndias: ",+ dias)
       



       
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */