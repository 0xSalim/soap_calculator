package server;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

class CalcClient {
	public static void main(String args[ ]) throws Exception {
		URL url = new URL("http://localhost:1234/calc");
	
		// Qualified name of the service:
		// 1st arg is the service URI
		// 2nd is the service name published in the WSDL
		QName qname = new QName("http://server/", "CalcServerImplService");
	
		// Create, in effect, a factory for the service.
		Service service = Service.create(url, qname);
		
		// Extract the endpoint interface, the service "port".
		CalcServer eif = service.getPort(CalcServer.class);
		
		int x = 1;
		int y = 1;
		String operation = "SUB";    // ADD, SUB, MULT, DIV
		
		System.out.println(eif.calculate(x,y,operation));
	}
}
