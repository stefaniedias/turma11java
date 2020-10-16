package lista6javaherança;

public class Empregado {
	
	public class Empregado extends ClassPessoa
	{
			/*para além dos atributos que caracterizam a classe Pessoa, 
			 * os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem retida dos impostos). 
			 * Implemente a classe Empregado com métodos seletores e modificadores e um método calcularSalario. 
			 */
		
			private int codigoSetor;
			private double salarioBase;
			private static final double IMPOSTO = 0.05;
			
			
			public Empregado() 
			{
				
			}
			
			
			public Empregado(String nome, String endereço, String telefone, char sexo, int codigoSetor, double salarioBase) 
			{
				super(nome, endereço, telefone, sexo);
				this.codigoSetor = codigoSetor;
				this.salarioBase = salarioBase;
				
			}
			public int getCodigoSetor() 
			{
				return codigoSetor;
			}
			public void setCodigoSetor(int codigoSetor) 
			{
				this.codigoSetor = codigoSetor;
			}
			public double getSalarioBase() 
			{
				return salarioBase;
			}
			public void setSalarioBase(double salarioBase) 
			{
				this.salarioBase = salarioBase;
			}

			
			@Override
			public String toString() 
			{
				return "Empregado [codigoSetor=" + codigoSetor + ", salarioBase=" + salarioBase 
						+ ", getNome()=" + getNome() + ", getEndereço()=" + getEndereço() + ", getTelefone()="
						+ getTelefone() + ", toString()=" + "]";
			}
			
			public double calcularValorImposto() 
			{
				return IMPOSTO*salarioBase;
			}
			
			public double calcularSalario(Empregado emp) 
			{
				return emp.salarioBase - emp.calcularValorImposto();
			}
			
		
	}

}
