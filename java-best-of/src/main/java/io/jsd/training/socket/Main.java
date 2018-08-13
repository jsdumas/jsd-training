package io.jsd.training.socket;

public class Main {
	
	   public static void main(String[] args) {
		    
		      String host = "127.0.0.1";
		      int port = 2345;
		      
		      TimeServer timeServer = new TimeServer(host, port);
		      timeServer.open();
		      
		      System.out.println("Serveur initialisé.");
		      
		      for(int i = 0; i < 5; i++){
		         Thread thread = new Thread(new ClientConnexion(host, port));
		         thread.start();
		      }
		   }


}
