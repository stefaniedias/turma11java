package javalista3;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int x =0;
int par =0; 
int impar=0; 
int num=0;
		
		
		Scanner tec = new Scanner(System.in);
		
		for(x = 1; x<= 10; x++) 
		{
			System.out.print("Digite um número");
			num = tec.nextInt(); }
			if(num % 2 !=0) 
			{
				impar++;	
			}else
			{
				par++;}
			}
                               
		System.out.printf(" %d números pares e %d número ímpares", par, impar); 
		

		tec.close();
		
}

}