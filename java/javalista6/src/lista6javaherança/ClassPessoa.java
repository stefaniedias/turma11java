package lista6javaherança;

public class ClassPessoa {
	
	
	public ClassPessoa(String nome, char sexo) {
		// TODO Auto-generated constructor stub
	}

	{
		private String nome;
		private String endereço;
	    private String telefone;
	    private char sexo;
		
		public Pessoa (String  nome, char  sexo ) {
			this.nome = nome;
			this.sexo = sexo;
		}
		
		public  Pessoa () {
			
		}

		public  Pessoa ( String  nome , String  endereco , String  telefone , char  sexo ) {
			this. nome = nome;
			this. endereço = endereço;
			this. telefone = telefone;
			this. sexo = sexo;
		}
		
		public  String  getNome () {
			return nome;
		}
		public  void  setNome ( String  nome ) {
			isso . nome = nome;
		}
		public String getEndereco () {
			retorno endereço;
		}
		public void setEndereco ( String  endereco ) {
			this.endereço = endereço;
		}
		public  String  getTelefone () {
			return telefone;
		}
		public  void  setTelefone ( String  telefone ) {
			this.telefone = telefone;
		}
		
		
		@Sobrepor
		public  String  toString () {
			return  " Pessoa [nome = "  + nome +  " , endereço = "  + endereço +  " , telefone = "  + telefone +  " ] ";
		}
		
	}


}

