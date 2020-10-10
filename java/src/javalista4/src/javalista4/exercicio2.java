package javalista4;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {

		
		//Faça um programa que receba 6 números inteiros e mostre: 
			//• Os números pares digitados;  
			//• A soma dos números pares digitados; 
			//• Os números ímpares digitados; 
		//	• A quantidade de números ímpares digitados.
			
			int s [] = new int[6];
			int somaPar=0;
			int somaImpar = 0;
			int numero =0;
			
			Scanner leia = new Scanner(System.in);
			
			
			for(int x = 0 ; x< s.length; x++) 
			{
				System.out.print("Digite um número para o vetor: ");
				 numero = leia.nextInt();
				 s[x]=numero;
				if(numero%2 ==0) 
				{
					System.out.printf("O número %d digitado é par!\n", numero);
					somaPar += numero;
				}else 
				{
					System.out.printf("O número %d digitado é ímpar!\n", numero);
					somaImpar++;

				}
			}
			
			System.out.println("A soma de números pares digitados foi de: "+ somaPar);
			System.out.println("A quantidade de números ímpares digitados foi de: "+ somaImpar);
		}

		
		
	}

