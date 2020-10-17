package lista7java;

public class animal {
	
		private String nome;
		private  int idade;
		public void Animal ( String nome , int idade ) {
			
			this.nome = nome;
			this.idade = idade;
		}
		public  String  getNome () {
			return nome;
		}
		public  void  setNome ( String  nome ) {
			this.nome = nome;
		}
		public  int  getIdade () {
			return idade;
		}
		public  void  setIdade ( int  age ) {
			extracted();
		}
		private int extracted() {
			return this.idade = idade;
		}
		
		public  void  emitirSom () {
			
		}

}
