package javalista3;

import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String args[]) {
	
	//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.

	Scanner leia = new Scanner(System.in);
	
	int soma= 0 , numero = 1;
	
	
	do
	{
		
		System.out.printf( " Digite um n�mero: " );
		numero= leia.nextInt ();
		soma= soma+numero;
		
	} while (numero != 0 );

	System.out.printf ( " A soma dos n�meros digitados foi: "  + soma);

	
	
}
}


