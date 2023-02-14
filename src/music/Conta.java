package music;

public class Conta {
	
	private String conta;
	private String usuario;
	private Musica musica; //associação entre a class Conta e a class Musica
	
	public Conta() {
		
	}

	public Conta(String conta, String usuario, Musica musica) {
		this.conta = conta;
		this.usuario = usuario;
		this.musica = musica;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Musica getMusica() {
		return musica;
	}

	public void setMusica(Musica musica) {
		this.musica = musica;
	}
	

}
