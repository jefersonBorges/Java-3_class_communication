package bank_account;

public class Correntista {
	
	private String nome;
	private String endereco;
	private ContaBancaria conta;
	
	public Correntista() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public ContaBancaria getContaBancaria() {
		return conta;
	}
	
	public void setContaBancaria(ContaBancaria conta) {
		this.conta = conta;
	}

}
