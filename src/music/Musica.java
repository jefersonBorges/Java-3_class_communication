package music;

public class Musica {
	
	private String nomeDaMusica;
	private String conjunto;
	private String albumDaMusica;
	private int anoDoAlbum;
	private Conta conta; //associação entre a class Musica e a class Conta
	
	public Musica() {
		
	}
	
	public Musica(String nomeDaMusica, String conjunto, String albumDaMusica, int anoDoAlbum) {
		
		this.nomeDaMusica = nomeDaMusica;
		this.conjunto = conjunto;
		this.albumDaMusica = albumDaMusica;
		
		//verificação do ano
		if((anoDoAlbum<=2021) && (anoDoAlbum>=0)) {
			this.anoDoAlbum = anoDoAlbum;

		}else {
			this.anoDoAlbum = 0;
		}
		
	}
	public String getNomeDaMusica() {
		return nomeDaMusica;
	}
	public void setNomeDaMusica(String nomeDaMusica) {
		this.nomeDaMusica = nomeDaMusica;
	}
	public String getConjunto() {
		return conjunto;
	}
	public void setConjunto(String conjunto) {
		this.conjunto = conjunto;
	}
	public String getAlbumDaMusica() {
		return albumDaMusica;
	}
	public void setAlbumDaMusica(String albumDaMusica) {
		this.albumDaMusica = albumDaMusica;
	}
	public int getAnoDoAlbum() {
		return anoDoAlbum;
	}
	public void setAnoDoAlbum(int anoDoAlbum) {
		//verificação do ano
		if((anoDoAlbum<=2021) && (anoDoAlbum>=0)) {
			this.anoDoAlbum = anoDoAlbum;

		}else {
			this.anoDoAlbum = 0;
		}
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	

}
