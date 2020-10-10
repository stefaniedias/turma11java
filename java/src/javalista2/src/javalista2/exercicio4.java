package javalista2;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		
		/*
		 * Faça um programa em que permita a entrada de um número qualquer e 
		 * exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; 
		 * se for ímpar exiba o número elevado ao quadrado.
		 */
		
		
		int numero;
		String resultado;

		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		
		//Operador ternário precisa de ((condição)? o que acontece se for positivo : e o que acontece se for negativ 
		  resultado= ((numero == 0)? "Você digitou 0! " :((numero %2 == 0)?  ((numero<0)? "Não há raiz quadrada de número negativo" :"Este número é par e sua raiz quadrada é: " + Math.sqrt(numero)) : "Este número é ímpare seu valor elevado ao quadrado é: " + Math.pow(numero, 2)));
		  System.out.println(resultado);
		
		
		leia.close();
			
		
		
	}

}
