programa
{
	
	funcao inicio()
	{
		
	{
		/ *
 * A Secretaria de Meio Ambiente que controla o índice de sustenta 3 grupos de indústrias que são altamente poluentes do meio ambiente. 
* O índice de tolerância aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades,
 * se o índice atingir 0,5 todos os grupos devem ser notificados para paralisar suas atividades. 
 * Faça um sistema que leia o índice de índice medido e emita uma notificação adequada aos diferentes grupos de empresas.
 * /

		indice real


		escrever ("Digite o índice de índice:")
		leia (indicePoluicao)


		se (indicePoluicao <0,3) {
			escreva ("o indice foi de:" + indicePoluicao + "Indices normais")
			} senao se( indicePoluicao <0.4){
				escreva("o indice foi de : "+ indicePoluicao +" A indústrias do 1º grupo estão intimadas a suspenderem suas atividades")
				}senao se(indicePoluicao  < 0.5){
					escreva("o indice foi de : "+indicePoluicao+" A indústrias do 1º grupo e do 2º grupo estão intimadas a suspenderem suas atividades")
					} senao{
						escreva("o indice foi de : "+indicePoluicao+" Todas as indústrias  estão intimadas a suspenderem suas atividades")
						}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1331; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */