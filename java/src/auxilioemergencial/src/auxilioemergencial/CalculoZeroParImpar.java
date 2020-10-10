package auxilioemergencial;

import java.util.Scanner;

public class CalculoZeroParImpar {

	public static void main(String[] args) {
		/*inteiro valorUsuario
		escreva("Digite um valor: ")
		leia(valorUsuario)
		se (valorUsuario > 0) {
			se ((valorUsuario % 2) == 0) {
				escreva("O valor é positivo e par")	
			}
			senao {
				escreva("O valor é positivo e ímpar")
			}
		}
		senao se (valorUsuario <0) {
			se ((valorUsuario % 2) == 0) {
			escreva("O valor é negativo e par")
			}
			senao {
				escreva("O valor é negativo e ímpar")
			}
		}
		senao {
			escreva("Você digitou 0") */
		
		Scanner tec = new Scanner(System.in);
	
		
		double numero;
		
			System.out.print("Digite um numero que direi se ele é\nImpar, Par ou Negativo ");
		numero = tec.nextDouble();
		if (numero < 0){
			System.out.printf("Você digitou %.0f, é um numero negativo",numero);
		}else if (numero == 0) {
			System.out.println("Você digitou 0, é um numero neutro");
		}else if (numero%2 == 0){
			System.out.printf("Você digitou %.0f, é um numero Par! e positivo",numero);
		}else{
		System.out.printf("Você digitou %.0f, é um numero Impar! e positivo",numero);
		}
	}
		
		
	}
	

