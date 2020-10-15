package exercicioslista5;

public class ProdutoEletrico {

	
	public class ProdutoEletronico {
		public boolean ligado;
		public int tensao;
		
		
		
		public void ligar() {
			ligado = true;
			System.out.println("foi ligado");
			
		}

		public void desligar() {
			ligado = false;
			System.out.println("Foi desligado");
		}
	}
}
