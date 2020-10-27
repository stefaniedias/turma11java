package bancoprojeto;

public static void main(String[] args) {
        
       System.out.println("***bem vindo a sua Conta Bancaria ***");
        
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNome("roberta miranda"); // nome ficticio
        contaSimples.setNumeroConta("11111"); //numero aleatorio
        
        // valor fixo colocado exemplo
        contaSimples.debitar(200);
        
        // primeiro item testado
        realizarSaque(contaSimples, 50);
        
        // segundo item
        realizarSaque(contaSimples, 70);
        
        System.out.println(contaSimples);
        
        
        
        
        //poupança
        System.out.println("*** Teste ContaPoupança ***");
        
        ContaPoupança contaPoupacanca = new ContaPoupança();
        contaPoupacanca.setNome("douglas mithel");
        contaPoupacanca.setNumeroConta("22222");
        contaPoupacanca.setDiaRendimento(3); // todo dia 3, rende
        
        
        // valor fixo
        contaPoupacanca.debitar(100);
        
        realizarSaque(contaPoupacanca, 50);
        
        realizarSaque(contaPoupacanca, 70);
        
        // redimentos de o.5 
        if (contaPoupacanca.calcularNovoSaldo(0.5)){
            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupacanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
        }
        
        System.out.println(contaPoupacanca);
        
        
        // teste a especial
        
        System.out.println("*** Teste ContaEspecial ***");
        
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNome("alisson candras");
        contaEspecial.setNumeroConta("33333");
        contaEspecial.setLimite(3000);
        
        contaEspecial.debitar(100);
        
        realizarSaque(contaEspecial, 50);
        
        realizarSaque(contaEspecial, 70);
        
        realizarSaque(contaEspecial, 80);
        
        System.out.println(contaEspecial);
    }
    
    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.debitar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " + ContaEspecial.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + conta.getSaldo());
        }
    }
    
}
