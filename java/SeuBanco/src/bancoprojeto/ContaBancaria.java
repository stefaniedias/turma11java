package bancoprojeto;

public class ContaBancaria {
		 
	private static String nome;
	private static String numeroConta;
	private static double saldo= 3000;
	

	public static void main(String[] args) {

	}
	    
	
	// retorna nome
	    
	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		ContaBancaria.nome = nome;
	}     
	//nome acaba aqui
	
	// mumero da conta
	public static String getNumeroConta() {
		return numeroConta;
	}


	public static void setNumeroConta(String numeroConta) {
		ContaBancaria.numeroConta = numeroConta;
	}
	
	//saldo da conta
	public static double getSaldo() 
	{
		return saldo;
	}

	public static void setSaldo(double saldo)
	{
		ContaBancaria.saldo = saldo; 
		
	}
	
	
	@Override
	public String toString() 
	{    
		String s = " ContaBancaria{";
		s += " nome: " + nome;
		s += " nomuroConta: " + numeroConta;
		s += " saldo: " + saldo;
		s += "}";
		return s;
	}
	
	//creditar e depositar
	
	public void creditar(double valor) {
		saldo += valor;
	}
	
	
	
	public boolean debitar(double valor) {
		if ( (saldo-valor) >=0 ) {
			saldo = valor;
			return true;
		}
		return false;
	}


		}

