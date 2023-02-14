package music;

public class App {
	
	public static void main(String[] args) {
		
		//cadastro músicas
		//teste utilizando construtor musica ano correto
		
		Musica musica1 = new Musica ("Harvester of Sorrow", "Metallica", "And Justice For All", 1988);
		 System.out.println("A música '"+musica1.getNomeDaMusica()
		 					+"' da banda '"+musica1.getConjunto()
		 					+"' pertence ao álbum '"+musica1.getAlbumDaMusica()
		 					+ "' lançado em "+musica1.getAnoDoAlbum()+".");
		 
		//final teste utilizando construtor musica ano correto
		//teste utilizando construtor musica ano incorreto
		 
			Musica musica2 = new Musica ("King Nothing", "Metallica", "Load", -2);
			 System.out.println("A música '"+musica2.getNomeDaMusica()
			 					+"' da banda '"+musica2.getConjunto()
			 					+"' pertence ao álbum '"+musica2.getAlbumDaMusica()
			 					+ "' lançado em "+musica2.getAnoDoAlbum()+".");
		 
		//final teste utilizando construtor musica ano incorreto
		//teste utilizando setter musica ano correto
				
			 Musica musica3 = new Musica ();
			 musica3.setNomeDaMusica("Murder one");
			 musica3.setConjunto("Metallica");
			 musica3.setAlbumDaMusica("Hardwired to Self Destruct");
			 musica3.setAnoDoAlbum(2016);
			 
			System.out.println("A música '"+musica3.getNomeDaMusica()
				 				+"' da banda '"+musica3.getConjunto()
				 				+"' pertence ao álbum '"+musica3.getAlbumDaMusica()
				 				+ "' lançado em "+musica3.getAnoDoAlbum()+".");
				 
		//final teste utilizando setter musica ano correto
		//teste utilizando setter musica ano incorreto
			
			 Musica musica4 = new Musica ();
			 musica4.setNomeDaMusica("For whom the bell tolls");
			 musica4.setConjunto("Metallica");
			 musica4.setAlbumDaMusica("Ride the Lightning");
			 musica4.setAnoDoAlbum(2022);
			 
			System.out.println("A música '"+musica4.getNomeDaMusica()
				 				+"' da banda '"+musica4.getConjunto()
				 				+"' pertence ao álbum '"+musica4.getAlbumDaMusica()
				 				+ "' lançado em "+musica4.getAnoDoAlbum()+".");
				 
		//final teste utilizando setter musica ano incorreto
		//final cadastro músicas
			
		//cadastro contas
		Conta conta1= new Conta("conta1@email.com", "usuário 1", musica1);
		
		//exibição da conta e música favorita
		System.out.println("Conta: "+ conta1.getConta()
							+"\nUsuário: "+ conta1.getUsuario()
							+"\nMúsica favorita: "+conta1.getMusica().getNomeDaMusica()
							+"\nConjunto: "+conta1.getMusica().getConjunto()
							+"\nAlbum: " +conta1.getMusica().getAlbumDaMusica()
							+"\nAno: "+conta1.getMusica().getAnoDoAlbum());
		
		Conta conta2= new Conta("conta2@email.com", "usuário 2", musica3);
		
		//exibição da conta e música favorita
		System.out.println("Conta: "+ conta2.getConta()
							+"\nUsuário: "+ conta2.getUsuario()
							+"\nMúsica favorita: "+conta2.getMusica().getNomeDaMusica()
							+"\nConjunto: "+conta2.getMusica().getConjunto()
							+"\nAlbum: " +conta2.getMusica().getAlbumDaMusica()
							+"\nAno: "+conta2.getMusica().getAnoDoAlbum());
		//final cadastro contas
	}
}
