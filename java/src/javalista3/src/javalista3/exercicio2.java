package javalista3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
	
		
		int x =0;
		int par =0; 
		int impar=0; 
		int num=0;
				
				
				Scanner tec = new Scanner(System.in);
				
				for(x = 1; x<= 10; x++) 
				{
					System.out.print("Digite um n�mero: ");
					num = tec.nextInt(); 
					
				
					if(( num %2) ==0) 
					{
						par++;	
					}else
					{
						impar++;
					}
				}
		                               
				System.out.printf(" %d n�meros impares e %d n�mero pares", impar, par); 
				
				tec.close();
				

	}

}
