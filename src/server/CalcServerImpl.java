package server;

import javax.jws.WebService;

/**
* @WebService permet de faire le lien entre le SIB (cette classe)
* et le SEI (server.CalcServer)
*/

@WebService(endpointInterface = "server.CalcServer")
public class CalcServerImpl implements CalcServer{
	public int calculate(int x,int y,String operation) throws Exception {
		if ((x<0)||(y<0)) {
			throw new Exception("Un ou plusieurs parametres sont negatifs !");
		}
		int result;
		if ("ADD".equals(operation)) {
			result = x + y;
		} else if ("SUB".equals(operation)) {
			result = x - y;
		} else if ("MULT".equals(operation)) {
			result = x * y;
		} else if ("DIV".equals(operation)) {
			result = x / y;
		} else {
			throw new Exception("L'operation est incorrecte : il faut mettre ADD, SUB, MULT ou DIV !");
		}
		if (result<0) {
			throw new Exception("Le resultat est negatif !");
		}
		return result;
		//return new Date().toString(); 	
	}
}