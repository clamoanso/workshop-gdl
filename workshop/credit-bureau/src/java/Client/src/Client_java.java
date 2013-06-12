import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class Client_java{
	BufferedReader reader;
	@SuppressWarnings("resource")
	
	public void establishConnection(){
		try{
			Socket s = new Socket("127.0.0.1", 3550);
			
			DatoSocket dato = new DatoSocket("Hola");  
			DataOutputStream bufferSalida = new DataOutputStream (s.getOutputStream());  
			
						
			DataInputStream bufferEntrada = new DataInputStream (s.getInputStream());
			DatoSocket aux = new DatoSocket("");
            aux.readObject (bufferEntrada);
            dato.writeObject (bufferSalida);
			System.out.println ("Servidor Java: Enviado " + dato.toString());
		    System.out.println ("Servidor java: Recibido " + aux.toString());
		           
			bufferEntrada.close();
			bufferSalida.close();
			System.exit(0);
			s.close();
		
			// reader.close();
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
	
	
	public static void main(String[] args){
		new Client_java().establishConnection();
	}
			
	
}