package exercicioslista5;
	
	public  class  Aviao {
		public  String nome;
		public  int asas;
		public  String estado;
		public  int velocidade;
		public  String cor;
		
		
		
		public  void  voando () {
			estado = "seguindo reto";
			
		}
		public void  virarDireita () {
			estado = "Virando a Direita ";
			
		}
		public void  virarEsquerda () {
			estado = "Virando a Esquerda";
			
		}
		public  void subir () {
			estado = "subindo";
			
		}
		public void  descer () {
			estado = " Descer";
			
		}

	}
}


