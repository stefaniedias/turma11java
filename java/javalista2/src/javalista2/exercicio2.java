package javalista2;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		
		/*
		 * Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		
		int num1=0, num2= 0 , num3 = 0;
		
		Scanner leia =  new  Scanner (System.in);
		
		
		System.out.println( " Digite o primeiro valor: " );
		num1 = leia.nextInt();
		System.out.println( " Digite o segundo valor: " );
		num2= leia.nextInt();
		System.out.println( " Digite o terceiro valor: " );
		num3= leia.nextInt();

		
				
		
		
		if (num1 > num2 && num2 > num3)
		{
			
			if (num2 > num3)
			{
				System.out.printf( " Os números e ordem crescente:% d,% d,% d " , num1, num2, num3);
				
			} else 
			{
				System.out.printf( " Os números em ordem:% d,% d,% d ", num1, num3, num2);
			}
		} 
		else  if (num2 > num1 && num2 > num3)
		{
			if (num1 > num3)
			{
				System.out.printf( " Os números e ordem crescente:% d,% d,% d ", num2, num1, num3);
				
			} else 
			{
				System.out.printf( " Os números e ordem crescente:% d,% d,% d " , num2, num3, num1);
			}

		}
		else  if (num3 > num1 && num3 > num2)
		{
			if (num1 > num3)
			{
				System.out.printf( " Os números e ordem crescente:% d,% d,% d " , num3, num1, num2);
				
			} else 
			{
				System.out.printf( " Os números e ordem crescente:% d,% d,% d " , num3, num2, num1);
			}
		}
		leia.close();

	}

}
