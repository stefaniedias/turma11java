package javalista2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		
		/*
		 * Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto
		 */
		
		int idade = 0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
		
		if(idade<10) 
		{
			System.out.printf("A sua idade �: %d anos! e voc� � muito jovem para competir! ", idade);

		}
		else if(idade >= 10 && idade <15)
		{
			System.out.printf("A sua idade �: %d anos e voce � da categoria Infantil! ", idade);

		} else if(idade< 18) 
		{
			System.out.printf("A sua idade �: %d anos e voc� � da categoria Juvenil! ", idade);
		}else if(idade< 26) 
		{
			System.out.printf("A sua idade �: %d anos e voc� � da categoria Adulto! ", idade);

		}else 
		{
			System.out.printf("A sua idade �: %d anos e voc� n�o pode mais competir ", idade);

		}
		
		leia.close();

	}

}
