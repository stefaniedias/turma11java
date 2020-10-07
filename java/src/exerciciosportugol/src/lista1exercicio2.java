package exerciciosportugol;

import java.util.Scanner;

public class lista1exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int anos, meses, dias, tempo = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
   System.out.println("Digite os dias: ");
		
		tempo = sc.nextInt();
		
		anos = tempo / 365;
		meses = (tempo % 365) / 30;		
		dias = (tempo % 365) % 30;
		
		System.out.println("Anos: " + anos 
						 + "\nMeses: " + meses  
						 + "\nDias: " + dias );
		
	}

}
