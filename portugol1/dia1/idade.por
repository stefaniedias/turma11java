programa
{
	
	funcao inicio()
	{
		cadeia nomeUsuario
		personagem opcao
		inteiro anoNascimento
		inteiro idadeUsuario

		escreva ("Digite o seu nome:")
		leia (nomeUsuario)
		escreva ("Digite M - masculino ou F - feminino:")
		leia (opcao)

		se (opcao == 'F') {
				escreva ("Oi Senhora", nomeUsuario)
		}
		senao se (opcao == 'f') {
				escreva ("Oi Senhora", nomeUsuario)
		}
		senao se (opcao == 'M') {
				escreva ("Oi Senhor", nomeUsuario)
		}
		senao se (opcao == 'M') {
				escreva ("Oi Senhor", nomeUsuario)
		}
		senao {
		 		escreva ("Oi Senhorx,", nomeUsuario)

		 		escreva ("Digite o seu ano de nascimento:")
		 		leia (anoNascimento)

		 		escreva ("Digite o sua idade:")
		 		leia (idadeUsuario)

		 		se idade (idadeUsuario <25) {
		 			escrever ("jovem")
		 		}

		 		senao se (idadeUsuario> 25 e idadeusuario <= 58) {
		 			escrever ("maduro")

		 		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 873; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */