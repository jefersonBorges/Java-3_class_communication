package music;

public class App {
	
	public static void main(String[] args) {
		
		//cadastro m�sicas
		//teste utilizando construtor musica ano correto
		
		Musica musica1 = new Musica ("Harvester of Sorrow", "Metallica", "And Justice For All", 1988);
		 System.out.println("A m�sica '"+musica1.getNomeDaMusica()
		 					+"' da banda '"+musica1.getConjunto()
		 					+"' pertence ao �lbum '"+musica1.getAlbumDaMusica()
		 					+ "' lan�ado em "+musica1.getAnoDoAlbum()+".");
		 
		//final teste utilizando construtor musica ano correto
		//teste utilizando construtor musica ano incorreto
		 
			Musica musica2 = new Musica ("King Nothing", "Metallica", "Load", -2);
			 System.out.println("A m�sica '"+musica2.getNomeDaMusica()
			 					+"' da banda '"+musica2.getConjunto()
			 					+"' pertence ao �lbum '"+musica2.getAlbumDaMusica()
			 					+ "' lan�ado em "+musica2.getAnoDoAlbum()+".");
		 
		//final teste utilizando construtor musica ano incorreto
		//teste utilizando setter musica ano correto
				
			 Musica musica3 = new Musica ();
			 musica3.setNomeDaMusica("Murder one");
			 musica3.setConjunto("Metallica");
			 musica3.setAlbumDaMusica("Hardwired to Self Destruct");
			 musica3.setAnoDoAlbum(2016);
			 
			System.out.println("A m�sica '"+musica3.getNomeDaMusica()
				 				+"' da banda '"+musica3.getConjunto()
				 				+"' pertence ao �lbum '"+musica3.getAlbumDaMusica()
				 				+ "' lan�ado em "+musica3.getAnoDoAlbum()+".");
				 
		//final teste utilizando setter musica ano correto
		//teste utilizando setter musica ano incorreto
			
			 Musica musica4 = new Musica ();
			 musica4.setNomeDaMusica("For whom the bell tolls");
			 musica4.setConjunto("Metallica");
			 musica4.setAlbumDaMusica("Ride the Lightning");
			 musica4.setAnoDoAlbum(2022);
			 
			System.out.println("A m�sica '"+musica4.getNomeDaMusica()
				 				+"' da banda '"+musica4.getConjunto()
				 				+"' pertence ao �lbum '"+musica4.getAlbumDaMusica()
				 				+ "' lan�ado em "+musica4.getAnoDoAlbum()+".");
				 
		//final teste utilizando setter musica ano incorreto
		//final cadastro m�sicas
			
		//cadastro contas
		Conta conta1= new Conta("conta1@email.com", "usu�rio 1", musica1);
		
		//exibi��o da conta e m�sica favorita
		System.out.println("Conta: "+ conta1.getConta()
							+"\nUsu�rio: "+ conta1.getUsuario()
							+"\nM�sica favorita: "+conta1.getMusica().getNomeDaMusica()
							+"\nConjunto: "+conta1.getMusica().getConjunto()
							+"\nAlbum: " +conta1.getMusica().getAlbumDaMusica()
							+"\nAno: "+conta1.getMusica().getAnoDoAlbum());
		
		Conta conta2= new Conta("conta2@email.com", "usu�rio 2", musica3);
		
		//exibi��o da conta e m�sica favorita
		System.out.println("Conta: "+ conta2.getConta()
							+"\nUsu�rio: "+ conta2.getUsuario()
							+"\nM�sica favorita: "+conta2.getMusica().getNomeDaMusica()
							+"\nConjunto: "+conta2.getMusica().getConjunto()
							+"\nAlbum: " +conta2.getMusica().getAlbumDaMusica()
							+"\nAno: "+conta2.getMusica().getAnoDoAlbum());
		//final cadastro contas
	}
}
