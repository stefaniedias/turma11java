package exercicioslista5;

public class ClasseExercicio1cliente {

}public class Cliente 
{
	String nome;
	char sexo;
	int idade;
	double carteira;
	boolean fome = false;
	
	
	public Cliente(String nome, char sexo, int idade, double carteira) 
	{
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.carteira = carteira;
	}
	
	
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", carteira=" + carteira
				+ ", fome=" + fome + "]";
	}



	public Cliente() 
	{
		
	}
	
	public void receber(double salario) 
	{
		 this.carteira +=salario;
	}
	
	public void gastar(double gasto) 
	{
		carteira -= gasto;
		this.fome = true;
	}
	
	public double contarDinheiro() 
	{
		return this.carteira;
	}
	
	public boolean estouComFome() 
	{
		return this.fome;
	}
	
	public void comer() 
	{
		this.fome= false;
	}
	

