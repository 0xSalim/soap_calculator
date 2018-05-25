package server;

import javax.xml.ws.Endpoint;

/**
* Permet de publier le web service qui a pour SIB server.CalcServerImpl. 
* Le publisher tourne de maniere indefinie et attend de recevoir des requetes
*/

public class CalcServerPublisher {
	public static void main(String[ ] args) {
		// 1er parametre : URL de publication (pour ouvrir le contrat WSDL sur navigateur, ajouter "?wsdl")
		// 2eme parametre : instance du SIB
		Endpoint.publish("http://localhost:1234/calc", new CalcServerImpl());
	}
}
