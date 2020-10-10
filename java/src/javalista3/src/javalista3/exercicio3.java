package javalista3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
        int  mais50 =0; 
        int menos21=0; 
       int idade =0;
		
		
		Scanner tec = new Scanner(System.in);
		
		while(idade != -99) 
		{
			System.out.println("Digite sua idade: * (Para sair digite -99)");
			idade = tec.nextInt();
			if(idade> 50)
			{
				mais50++;
			}else if(idade < 21 && idade > 0)
			{
				menos21++;
			}
			
		}
		
		System.out.printf("\nForam verificadas %d pessoas com menos de 21 anos e %d pessoas com mais de 50 anos", menos21, mais50);
}
	
	
	
}