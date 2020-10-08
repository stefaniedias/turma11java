package javalista2;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		
		//aça um programa que receba três inteiros e diga qual deles é o maior.
  
		Scanner leia= new Scanner(System.in);
		
		int numero1,numero2,numero3;
		String resultado;
		
		System.out.println("digite o primeiro numero inteiro: \n");
		numero1=leia.nextInt();
		System.out.println("digite o segundo numero inteiro: \n");
		numero2=leia.nextInt();
		System.out.println("digite o terceiro numero inteiro: \n");
		numero3=leia.nextInt();
		
		   
		resultado= ((numero1 > numero2) ? ((numero1 > numero3) ? " O maior número é o primeiro, no valor de: " + numero1 :  " O maior número é o terceiro, no valor de: " + numero3) : ( (numero2 > numero3) ? " O maior número é o segundo, sem valor de: " + numero2 :  " O maior número é o terceiro, sem valor de: " + numero3));
		System.out.printf(resultado);
		
		leia.close();
			 
			 
					}

}
