package serveur;

import javax.xml.ws.Endpoint;

import service.BanqueService;

public class Serveur {
	 public static void main(String[] args) {
	Endpoint.publish("http://localhost:8585/BanqueWs/", new BanqueService());
		 System.out.println("serveur en cour");
}}
