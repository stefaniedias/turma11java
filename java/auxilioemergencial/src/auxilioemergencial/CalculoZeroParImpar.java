package auxilioemergencial;

import java.util.Scanner;

public class CalculoZeroParImpar {

	public static void main(String[] args) {
		/*inteiro valorUsuario
		escreva("Digite um valor: ")
		leia(valorUsuario)
		se (valorUsuario > 0) {
			se ((valorUsuario % 2) == 0) {
				escreva("O valor � positivo e par")	
			}
			senao {
				escreva("O valor � positivo e �mpar")
			}
		}
		senao se (valorUsuario <0) {
			se ((valorUsuario % 2) == 0) {
			escreva("O valor � negativo e par")
			}
			senao {
				escreva("O valor � negativo e �mpar")
			}
		}
		senao {
			escreva("Voc� digitou 0") */
		
		Scanner tec = new Scanner(System.in);
	
		
		double numero;
		
			System.out.print("Digite um numero que direi se ele �\nImpar, Par ou Negativo ");
		numero = tec.nextDouble();
		if (numero < 0){
			System.out.printf("Voc� digitou %.0f, � um numero negativo",numero);
		}else if (numero == 0) {
			System.out.println("Voc� digitou 0, � um numero neutro");
		}else if (numero%2 == 0){
			System.out.printf("Voc� digitou %.0f, � um numero Par! e positivo",numero);
		}else{
		System.out.printf("Voc� digitou %.0f, � um numero Impar! e positivo",numero);
		}
	}
		
		
	}
	

