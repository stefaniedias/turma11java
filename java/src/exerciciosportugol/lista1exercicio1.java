package exerciciosportugol;

import java.util.Scanner;

public class lista1exercicio1 {

	public static void main(String[] args) {

		
		/*//Variáveis
		// a=anos, m=meses, d=dias
		inteiro a, m, d, dias
		dias=0
		a=0
		m=0
		d=0
		escreva("Digite quantos dias de idade vc tem?: ")
		leia(dias)
		a=(dias/365)
		m=(dias%365)/30
		d=(dias%365)%30)
		escreva("Você tem ",a, " ano(s) ",m, " mês(s) ",d, " dia(s)! ")
	}
	 * 
	 */

	int anos, meses, dias, total = 0;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite os anos:");
	
	anos = sc.nextInt();
	
	System.out.println("Digite os meses:");
	
	meses = sc.nextInt();
	
	System.out.println("Digite os dias: ");
	
	dias = sc.nextInt();
	
	total = ((anos*365)+(meses*30)+dias);
			
			
	System.out.println("A pessoa viveu " + total + " dias");

}
}

