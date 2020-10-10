package auxilioemergencial;

import java.util.Scanner;

public class CalculoDoAuxilio {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		
		String nome;
		char genero;
        int anoNascimento = 0;
       
        int idade = 0;
        char chefa = 1200;
        
        
        System.out.println("informe seu nome: ");
        nome=leia.next();
        System.out.println("informe seu ano de nascimento: ");
         anoNascimento= leia.nextInt();
         
         idade= 2020-anoNascimento;
         
         System.out.println("informe seu genero f de feminio ou m de mscuino: ");
         chefa=leia.next().toUpperCase().charAt(0);
         System.out.println("informe seu genero f de feminio ou m de mscuino: ");
         genero=leia.next().toUpperCase().charAt(0);
         
         if ((genero=="s) && (idade>=18) && (genero=="m"));
           System.out.printf("ola",nome, "voce tem", idade, "e vai receber os R$600");
         idade= anoNascimento-2020;
         
         leia.close();
        
        
	}

}
