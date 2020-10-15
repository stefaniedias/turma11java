package exercicioslista5;

import java.util.Scanner;

public class Exercicio1classesEobjetos {

	public static void main(String[] args) {
		
			/* Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, 
			 * defina as instancias deste objeto e apresente as informações deste objeto no console.
	*/
			
			Scanner leia = new Scanner(System.in);
			
			Cliente cliente1 = new Cliente();
			System.out.println("Digite o seu nome: ");
			cliente1.nome = leia.next();
			
			System.out.println("Digite o seu sexo: F-feminino, M-masculino ou O-outros");
			cliente1.sexo = leia.next().toUpperCase().charAt(0);
			
			System.out.println("Digite sua idade: ");
			cliente1.idade = leia.nextInt();
			
			System.out.println("Digite quanto dinheiro possui: ");
			cliente1.carteira = leia.nextDouble();
			System.out.println(cliente1.toString());
			
			
			
			Cliente cliente2 = new Cliente( "michele", 'M', 24, 100.00);
			System.out.println(cliente2.toString());
			
			System.out.println("Cliente 1 está com fome?"+cliente1.estouComFome());
			System.out.println("Cliente 2 está com fome?"+cliente2.estouComFome());
			
			System.out.println("Cliente 1 tem quanto dinheiro?"+cliente1.contarDinheiro());
			System.out.println("Recebi meu salário!");
			cliente1.receber(1000.00);
			System.out.println("Cliente 1 tem quanto dinheiro?"+cliente1.contarDinheiro());
			cliente1.gastar(200.00);
			System.out.println("Paguei meu boleto!");
			System.out.println("Cliente 1 tem quanto dinheiro?"+cliente1.contarDinheiro());
			System.out.println("Cliente 1 está com fome?"+cliente1.estouComFome());
			cliente1.comer();
			System.out.println("Vim comer");
			System.out.println("Cliente 1 está com fome?"+cliente1.estouComFome());
			
		}

	}


