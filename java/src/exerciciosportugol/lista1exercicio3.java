package exerciciosportugol;

import java.util.Scanner;

public class lista1exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
      Scanner tec = new Scanner(System.in);
		
		/*//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
//1seg=1seg
//1minuto = 60segundos 
//1h=60 minutos. 60*60 =3600


		
		inteiro tempoDuracao = 0
		inteiro horas = 0
		inteiro segundos = 0
		inteiro minutos = 0

		escreva("digite o tempo em segundos: ")
		leia(tempoDuracao)
		horas = tempoDuracao/3600
		escreva("total de horas ",horas)

		minutos = (tempoDuracao%3600)/60
		escreva("total de minutos ",minutos)
		segundos =(tempoDuracao%3600)%60
		escreva("total segundos ",segundos)
		

		*/


int segundos, horas, minutos, seg;
		
		System.out.print("Digite o tempo em segundos: ");
		segundos = tec.nextInt();
		horas = (segundos / 3600);
		minutos = ((segundos / 60) - (horas * 60));
		seg = segundos - ((horas * 3600) + (minutos * 60));
		
		System.out.println("horas : "+horas);
		System.out.println("minutos : "+minutos);
		System.out.println("segundos : "+seg);
		
		
		
		tec.close();
	
		
	}

}
