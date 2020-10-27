package projetobarbearia;

public class cliente extends Pessoa {

	public cliente(int id, String nome) {
		super(id, nome);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		    
		    String endereco;
		    String cep;
  
		    
		 public cliente(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String endereco, String cep) {
		        super(id, nome, sexo, dataNascimento, telefone, email, rg);
		        this.endereco = endereco;
		        this.cep = cep;
		    }

		    public cliente(int id, String nome, String endereco, String cep) {
		        super(id, nome);
		        this.endereco = endereco;
		        this.cep = cep;
		    }
		    
		    public String getEndereco() {
		        return endereco;
		    }

		    public void setEndereco(String endereco) {
		        this.endereco = endereco;
		    }

		    public String getCep() {
		        return cep;
		    }

		    public void setCep(String cep) {
		        this.cep = cep;
		    }
		    
		    @Override
		    public String toString() {
		        return getNome();
		    }

	}

}
