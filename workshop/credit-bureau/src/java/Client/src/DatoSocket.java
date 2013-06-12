import java.io.*;

public class DatoSocket implements Serializable{
	private static final long serialVersionUID = 1L;

		   public DatoSocket (String cadena)
	   {
	      if (cadena != null)
	      {
	         c = cadena.length();
	         d = cadena;
	      }
	   }

	   
	   public int c = 0;
	     
	   public String d = "";
	     
	   public String toString ()
	   {
	     String resultado;
	          
	     resultado = Integer.toString(c) + " -- " + d;
	      return resultado;
	   }

	   public void writeObject(DataOutputStream out)
	         throws IOException
	     {
	  
	         out.writeInt (c);

	         out.writeBytes (d);
	         out.flush();
	         out.close();
	       }
	    
	     public void readObject(DataInputStream in)
	     throws IOException
	    {
	         c = in.readInt();
	         	         
	    byte [] aux = null;
	         
	     aux = new byte[c];     
	     in.read(aux, 0, c);   
	      d = new String (aux); 
	      in.read(aux,0,1);     
	      in.close();
	    }

}
