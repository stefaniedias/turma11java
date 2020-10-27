package bancoprojeto;

public class ContaCorrente {
	
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double saldo;
	
	boolean creditar(double valorsaque) {
		// tem saldo na conta??
		if (saldo>= valorsaque)
			saldo-=valorsaque;
		return true;} else{ 
			if (especial) {
			int valorsaque;
			double limite= limiteEspecial + valorsaque;
			if (limite>-valorsaque) {
				saldo= valorsaque;
				return true;
			} else { 
				return false; // nao eé especial e nao tem saldo suficiente
			}
	    }
		}
		
		void creditar1(double valorCreditado) {
			saldo+=valorCreditado; 
		}
		void consultarsaldo(double saldo){
				System.out.println("saldo atual da conta = " + saldo);
			
		}
		
		
		System.out.println("Qual é o número do seu talão de cheque :");
		this.talonario = leia.nextInt();
		System.out.println("O seu talão de cheque acabou? S-sim e N-não");
		opc = leia.next().toUpperCase().charAt(0);
		if(opc=='S')
		{
			
			
			
}
	
      
	
	
