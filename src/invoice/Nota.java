package invoice;

public class Nota {
	private String cpf;
	private Subtotal subtotal;
	private double total;
	
	public Nota (String cpf){
		this.cpf = cpf;
	}
	
	public void printNota() {
		System.out.println(	"Cliente: " + getCpf() + 
							" Produto: " + getSubtotal().getProduto().getNome()+
							" Quantidade: " + getSubtotal().getQuantidade()+
							" Valor unitário: " + getSubtotal().getProduto().getValor()+
							" Subtotal: " + getSubtotal().getValorSubtotal());
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Subtotal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(Subtotal subtotal) {
		this.subtotal = subtotal;
		this.subtotal.setNota(this);
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

}
