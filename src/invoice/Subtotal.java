package invoice;

public class Subtotal {
	private int quantidade;
	private Produto produto;
	private double valorSubtotal;
	private Nota nota;
	
	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}

	public Subtotal(int quantidade, Produto produto) {
		if(quantidade<0) {
			this.quantidade = 0;
		}else {
			this.quantidade = quantidade;
		}
		this.produto = produto;
		this.valorSubtotal = getQuantidade() * getProduto().getValor();
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		
		if(quantidade<0) {
			this.quantidade = 0;
		}else {
			this.quantidade = quantidade;
		}

	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double getValorSubtotal() {
		return valorSubtotal;
	}

	public void setValorSubtotal() {
		this.valorSubtotal = getQuantidade() * getProduto().getValor();
	}

}
