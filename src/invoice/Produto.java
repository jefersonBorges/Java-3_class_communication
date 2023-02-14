package invoice;

public class Produto {
	private String nome;
	private double valor;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		if(valor<0) {
			this.valor = 0;
		}else {
			this.valor = valor;
		}
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	public void setValor(double valor) {
		if(valor<0) { 
			this.valor = 0;
		}else {
			this.valor = valor;
		}
	}
	
	public double getValor() {
		return valor;
	}
}
	
