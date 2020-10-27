programa
{
	
	funcao inicio()
	{
		
	funcao inicio ()
	{

		/ *
		 1 A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R $ 100,00.  
		 * /

		// variavel
		inteiro filhos = 0
	     verdadeiro salario 
	     real media_sal
	     media_filhos real 
	     real maior_salario 
	     perc_salario real


		// laço
		para (x = 1; x <= 20; x ++) {

			// entrada
			escreva ("\ ninforme o seu salario:")
			leia (salario)
			()
			escrever ("\ ninforme o número de filhos:")
			leia (filhos)
			()

			// processamento
			media_sal = salario / x
			media_filhos = filhos / x

			// condicional
			se (salario <= 100,0) {
				perc_salario ++
			}
			se (salario> maior_salario) {
				maior_salario = salario
			}

		}

			// saida
			escreva ("\ nMedia do salário da população:", media_sal, 
			"\ nMédia do número de filhos:", media_filhos,
			"\ nMaior Salário:", maior_salario,
			"\ nPercentual de pessoal com salário até R $ 100,00:", perc_salario)
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1188; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */