package exercicioslista5;

public class Exercicio3classAobjetos {

	public static void main(String[] args) {

ProdutoEletrico produto = new ProdutoEletrico();
		


		produto.tensao = 200;
		
		System.out.println("Tensăo é :"+produto.tensao + "w");
		
		produto.ligar();
		
		produto.desligar();

	}
 
		
		
	}


