package javalista4;

public class exercicio1 {

	public static void main(String[] args) {
		 /*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
*/
		
		
		int vetor[] = {1, 0, 5, -2, -5, 7};
		int soma = vetor[0] + vetor[1] +vetor[5];
		
		System.out.println("O valor da soma dos valores do vetor �: "+ soma);
		
		vetor[4] = 100;
		
		for(int x =0 ; x< vetor.length; x++) 
		{
			System.out.printf("O valor do vetor na posi��o %d � de: %d \n", x, vetor[x]);
		}
		

	}

}