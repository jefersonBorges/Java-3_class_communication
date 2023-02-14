package bank_account;

public class App {
	
	public static void main (String args[]) {
		
	ContaBancaria cb01 = new ContaBancaria();
	Correntista cr01 = new Correntista();
	
	cb01.setCorrentista(cr01);
	cr01.setContaBancaria(cb01);
	cb01.setNumero(100);
	cr01.setNome("Jeferson");
	cr01.setEndereco("NH");
	
	cb01.getExtrato(cb01);
	
	cb01.depositarSaldo(cb01, 1500);
	cb01.sacarSaldo(cb01, 200);
	
	ContaBancaria cb02 = new ContaBancaria();
	Correntista cr02 = new Correntista();
	
	cb02.setCorrentista(cr02);
	cr02.setContaBancaria(cb02);
	cb02.setNumero(101);
	cr02.setNome("Borges");
	cr02.setEndereco("Sapucaia");
	
	cb02.getExtrato(cb02);
	
	cb01.trasnferirSaldo(cb01, 2500, cb02);
	cb01.sacarSaldo(cb01, 1400);
	
	cb01.trasnferirSaldo(cb01, 750, cb02);
	cb02.getExtrato(cb02);
	}

}
