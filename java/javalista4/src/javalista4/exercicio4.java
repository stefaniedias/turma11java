package javalista4;

import java.util.Scanner;

public class exercicio4 {

	
	public static void main(String[] args) {
		
		
		// Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
				//(1) somar as duas matrizes 
				//(2) subtrair a primeira matriz da segunda 
				//(3) adicionar uma constante as duas matrizes
			//	(4) imprimir as matrizes 
				//Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
				//Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
			
			
			
			int [][] matriz1= new int[2][2];
			int [][] matriz2= new int[2][2];
			int [][] matrizSoma= new int[2][2];
			int [][] matrizSub= new int[2][2];
			int colunaMatriz =0;
			int constante = 0;
			int linhaMatriz =0;
			int opc = 0;
			
			Scanner leia = new Scanner(System.in);
			
			for(int linha =0; linha< 2; linha++) 
			{
				for(int coluna =0; coluna< 2; coluna++) 
				{
					System.out.print("Digite um número para inserir no na matriz1: ");
					 matriz1[linha][coluna] = leia.nextInt();
					 System.out.print("Digite um número para inserir no na matriz2: ");
					 matriz2[linha][coluna] = leia.nextInt();
					
				}
			}
			
			
			
			while(opc < 5) 
			{
				System.out.println("Escolha uma opção: \n(1) somar as duas matrizes \r\n"
						+ "	\n(2) subtrair a primeira matriz da segunda \r\n"
						+ "		\n(3) adicionar uma constante as duas matrizes\r\n"
						+ "	\n(4) imprimir as matrizes "
						+ "	\n(5) Sair\r\n");
				opc = leia.nextInt();
				
			       switch (opc) {
			      	case 1: {
					
					for(int linha =0; linha< 2; linha++) 
					{
						for(int coluna =0; coluna< 2; coluna++) 
						{
							matrizSom[linha][coluna] =(matriz1[linha][coluna])+(matriz2[linha][coluna]);
							
		
						} 
					}
					break;
				}
			 	
			    	case 2: {
					 
					for(int linha =0; linha< 2; linha++) 
					{
						for(int coluna =0; coluna< 2; coluna++) 
						{
							matrizSom[linha][coluna] =(matriz1[linha][coluna]) - (matriz2[linha][coluna]);
		
						} 
					} 
					break;
				}
					
				   case 3: {
					
					
					System.out.print("Digite  qual  o valor deseja somar as matrizes?");
					constante = leia.nextInt();
					
					System.out.print("Digite  qual linha deseja adicionar o valor?");
					linhaMatriz = leia.nextInt();
					
					System.out.print("Digite  qual coluna deseja adicionar o valor?");
					colunaMatriz = leia.nextInt();
					
					matriz1[linhaMatriz][colunaMatriz] += constante;
					matriz2[linhaMatriz][colunaMatriz] += constante;
					break;
					
				}
				case 4: {
				
					
					for(int linha =0; linha< 2; linha++) 
					{
						for(int coluna =0; coluna< 2; coluna++) 
						{
							System.out.printf("Matriz1", +matriz1[linha][coluna]+ "Matriz"+ matriz2[linha][coluna]);
							System.out.println();
								
						} 
					}
					break;
				}
				default:
					break;
					
				}
			}
			
			leia.close();
			
	}
}
