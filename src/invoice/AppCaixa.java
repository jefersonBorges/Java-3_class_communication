package invoice;

public class AppCaixa {
	public static void main(String [] args) {
		
		Produto produto1 = new Produto("Lapis", 00.50);
		Produto produto2 = new Produto("Borracha", 00.35);
		//Produto produto3 = new Produto("Apontador", 00.15);
		
		System.out.println(produto1.getNome() + " "+ produto1.getValor());
		
		Nota nota1 = new Nota("111111111");
		Subtotal subtotal1 = new Subtotal(5, produto1);
		nota1.setSubtotal(subtotal1);
		nota1.printNota();
		
		Nota nota2 = new Nota("222222222");
		Subtotal subtotal2 = new Subtotal(10, produto2);
		nota2.setSubtotal(subtotal2);
		nota2.printNota();
		
		
	}
}
