package lista6javaheran�a;

public class heranca {
	
	public class Fornecedor extends ClassPessoa 
	{
		//valorCredito (correspondente ao cr�dito m�ximo atribu�do ao fornecedor) e valorDivida (montante da d�vida para com o fornecedor).
		//um m�todo obterSaldo() 
		// * que devolve a diferen�a entre os valores dos atributos valorCredito e valorDivida.
		
		private double valorCredito;
		private double valorDivida;
		

		
		public Fornecedor() 
		{
			
		}
		
		public Fornecedor(String nome, char sexo) {
			super(nome, sexo);
		}

		
		public Fornecedor( double valorCredito, double valorDivida) {
			this.valorCredito = valorCredito;
			this.valorDivida = valorDivida;
		}

		public Fornecedor(String nome, char sexo, double valorCredito, double valorDivida) {
			super(nome, sexo);
			this.valorCredito = valorCredito;
			this.valorDivida = valorDivida;
		}


		public double getValorCredito() {
			return valorCredito;
		}



		public void setValorCredito(double valorCredito) {
			this.valorCredito = valorCredito;
		}



		public double getValorDivida() {
			return valorDivida;
		}


		public void setValorDivida(double valorDivida) {
			this.valorDivida = valorDivida;
		}



		public double obterSaldo() 
		{
			return valorCredito - valorDivida;
		}
		
		@Override
		public String toString() {
			return "Fornecedor [valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + ", getNome()=" + getNome()
					+ ", getEndere�o()=" + getEndere�o() + ", getTelefone()=" + getTelefone() + ", toString()="
					 + "]";
		}

		public void setEndere�o(String string) {
			// TODO Auto-generated method stub
			
		}
		
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEndere�o() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTelefone() {
		// TODO Auto-generated method stub
		return null;
	}
	
