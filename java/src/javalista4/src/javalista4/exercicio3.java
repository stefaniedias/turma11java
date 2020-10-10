package javalista4;

public class exercicio3 {
	
	public static void main(String[] args) {

	int quantidade=0;

		
		
		// Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		 
		    int quantidade=0;
			int [][] matriz= new int[3][3];
			
			
			for(int linha =0; linha< 3; linha++) 
			{
				for(int coluna =0; coluna< 3; coluna++) 
				{
					matriz[linha][coluna]= (int) (Math.random()*100);
					
					System.out.println(matriz[linha][coluna]);
					
					if(matriz[linha][coluna] > 10) {
						System.out.println("Esse número é maior que dez! ");
						quantidade++;
					}
				} 
			}
			
			System.out.printf("Foram inseridos %d números maiores que 10", quantidade);
	}

}
