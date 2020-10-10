package javalista3;

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String args[]) {
	
	//Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.

	Scanner leia = new Scanner(System.in);
	
	int soma= 0 , numero = 1;
	
	
	do
	{
		
		System.out.printf( " Digite um número: " );
		numero= leia.nextInt ();
		soma= soma+numero;
		
	} while (numero != 0 );

	System.out.printf ( " A soma dos números digitados foi: "  + soma);

	
	
}
}


