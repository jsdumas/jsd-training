package io.jsd.training.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class TimeServer {
	
	 //On initialise des valeurs par défaut
	   private final int port;
	   private final String host;
	   private ServerSocket serverSocket = null;
	   private boolean isRunning = true;
	   
//	   public TimeServer(){
//	      try {
//	         serverSocket = new ServerSocket(port, 100, InetAddress.getByName(host));
//	      } catch (UnknownHostException e) {
//	         e.printStackTrace();
//	      } catch (IOException e) {
//	         e.printStackTrace();
//	      }
//	   }
	   
	   public TimeServer(String host, int port){
	      this.host = host;
	      this.port = port;
	      try {
	         serverSocket = new ServerSocket(port, 100, InetAddress.getByName(host));
	      } catch (UnknownHostException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	   }
	   
	   
	   //On lance notre serveur
	   public void open(){
	      //Toujours dans un thread à part vu qu'il est dans une boucle infinie
	      Thread thread = new Thread(new Runnable(){
	         @Override
			public void run(){
	            while(isRunning == true){
	               try {
	                  //On attend une connexion d'un client
	                  Socket client = serverSocket.accept();
	                  //Une fois reçue, on la traite dans un thread séparé
	                  System.out.println("Connexion cliente reçue.");                  
	                  Thread thread = new Thread(new ClientProcessor(client));
	                  thread.start();
	               } catch (IOException e) {
	                  e.printStackTrace();
	               }
	            }
	            
	            try {
	               serverSocket.close();
	            } catch (IOException e) {
	               e.printStackTrace();
	               serverSocket = null;
	            }
	         }
	      });
	      
	      thread.start();
	   }
	   
	   public void close(){
	      isRunning = false;
	   }   

}
