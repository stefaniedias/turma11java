package javalista2;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		
		/*
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e 
		 * exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; 
		 * se for �mpar exiba o n�mero elevado ao quadrado.
		 */
		
		
		int numero;
		String resultado;

		
		System.out.println("Digite um n�mero: ");
		numero = leia.nextInt();

		
		//Operador tern�rio precisa de ((condi��o)? o que acontece se for positivo : e o que acontece se for negativ 
		  resultado= ((numero == 0)? "Voc� digitou 0! " :((numero %2 == 0)?  ((numero<0)? "N�o h� raiz quadrada de n�mero negativo" :"Este n�mero � par e sua raiz quadrada �: " + Math.sqrt(numero)) : "Este n�mero � �mpare seu valor elevado ao quadrado �: " + Math.pow(numero, 2)));
		  System.out.println(resultado);
		
		
		leia.close();
			
		
		
	}

}
