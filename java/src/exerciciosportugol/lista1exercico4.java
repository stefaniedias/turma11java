package exerciciosportugol;

import java.util.Scanner;

public class lista1exercico4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		/* 
		 * nteiro A=0
	  inteiro B=0
	  inteiro C=0
	  inteiro D=0
	  inteiro R=0
	  inteiro S=0
	
	escreva("insira número inteiro:")
	leia(A)
	escreva("insira outro número inteiro:")
	leia(B)
	escreva("insira o último número inteiro:")
	leia(C)
	 System.out.println("insira um nome inteiro:  ");
		   a= leia.nextInt();
		   R = mat.potencia((A+B), 2)
	S = mat.potencia((B+C), 2)
	D = (R+S)/2
	escreva(D)


		 * 
		 */

		   int a=0;
		   int b=0;
		   int c=0;
	       int d=0;
		   int r=0;
		   int s=0;
		   
		   System.out.println("insira um nome inteiro:  ");
		   a= leia.nextInt();
		   System.out.println("insira um nome inteiro:  ");
		   b= leia.nextInt();
		   System.out.println("insira um nome inteiro:  ");
		   c= leia.nextInt();	
		   System.out.println("insira um nome inteiro:  ");
		   d= leia.nextInt();
		   System.out.println("insira um nome inteiro:  ");
		   r= leia.nextInt();
		   System.out.println("insira um nome inteiro:  ");
		   s= leia.nextInt();
		   
		   r = (a+b)*(a+b);
		   s = (b+c)*(b+c);
		   d = (r+s)/2;
				   
				   System.out.println(d);
	}
	

}
