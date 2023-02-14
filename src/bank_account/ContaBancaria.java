package bank_account;

public class ContaBancaria {
	
	private Correntista correntista;
	private int numero;
	private double saldo;
	
	public ContaBancaria() {
		
	}
	
	public Correntista getCorrentista() {
		return correntista;
	}
	
	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void acrescentarSaldo(double valor) {
		this.saldo = saldo + valor;
	}
	
	public void retirarSaldo(double valor) {
		this.saldo = saldo - valor;
	}
	
	public void trasnferirSaldo(ContaBancaria origem, double valor, ContaBancaria destino) {
		if (origem.saldo>=valor){
			origem.retirarSaldo(valor);
			destino.acrescentarSaldo(valor);
			System.out.println("valor de " + valor + " transferido da conta "+ origem.numero +" para a conta " + destino.numero);
		}else System.out.println("Valor de : R$ "+ valor + " na conta "+ origem.getNumero() +" indisponivel para transferencia!");
	}
	
	public void sacarSaldo(ContaBancaria origem, double valor) {
		if(saldo>=valor) {
			origem.retirarSaldo(valor);
			System.out.println ("Valor de : R$" + valor +" sacado com sucesso da conta " + origem.getNumero());
			System.out.println("Saldo remanescente: R$ " +  origem.getSaldo());
		}else System.out.println("Valor de : R$ " + valor + " indisponivel para retirada!");
	}
	public void depositarSaldo(ContaBancaria destino, double valor) {
		destino.acrescentarSaldo(valor);
		System.out.println("Dep�sito de: R$ "+ valor +" Efetuado com sucesso! Novo saldo de: R$ "+ destino.getSaldo());
	}
	
	public void getExtrato(ContaBancaria origem) {
		System.out.println("Conta numero: " + origem.getNumero());
		System.out.println("Correntista: "+ origem.getCorrentista().getNome());
		System.out.println("Endereco: "+ origem.getCorrentista().getEndereco());
		System.out.println("Saldo atual: "+ origem.getSaldo());
	}
	
	
}
