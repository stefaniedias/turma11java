package bancoprojeto;

import java.util.Scanner;


public class ContaEspecial extends ContaBancaria {
         private double limite;
         
         int saldoLimite = 3000;

    /**
     * retorna o limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * define o limite
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    
    // concatenei a saida de dados
    public String toString() {
        String s = "ContaEspecial[";
        s += " limite: " + limite;
        s += "; " + super.toString(); 
        s += "]" ;
        return s; 
    }
    
    //modo sacar
    public boolean sacar(double valor){
        
        double saldoComLimite = this.getSaldo() + limite;
        
        if ((saldoComLimite-valor) >=0){
            this.setSaldo(this.getSaldo()-valor);
            
            //super.sacar(valor);
            return true;
        }
        
        return false;
    }
}
