package javalista3;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).

		
int num= 1;
int quantidade = 0; 
int media = 0;
int soma = 0;
		
		Scanner tec =  new  Scanner(System.in);
		
		do
		{
			
			System.out.println( " Digite um número: " );
			num= tec.nextInt();
			
			if (num %3  == 0 )
			{
			quantidade ++ ;
			soma = soma + num;
			media = soma/quantidade;
			}
			
		} while (num != 0 );

		System.out.println( " A média dos números múltiplos de 3 foi: "  + soma);
		
	}

}
		
