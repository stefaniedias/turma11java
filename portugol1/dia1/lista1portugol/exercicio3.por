programa
{
	
	funcao inicio()
	{
		// Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
// 1seg = 1seg
// 1minuto = 60segundos 
// 1h = 60 minutos. 60 * 60 = 3600



		inteiro tempoDuracao = 0
		inteiras horas = 0
		inteiro segundos = 0
		inteiros minutos = 0

		escreva ("digite o tempo em segundos:")
		leia (tempoDuracao)
		horas = tempoDuracao / 3600
		escreva ("total de horas", horas)

		minutos = (tempoDuracao% 3600) / 60
		escrever ("total de minutos", minutos)
		segundos = (tempoDuracao% 3600)% 60
		escrever ("total segundos", segundos)


		// processamento 

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 629; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */