package edu.escuelaing.arsw.networking;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.net.URL;

public class valoresURL {
	
	private URL youtube;
	
	public valoresURL() throws MalformedURLException {
		
		youtube = new URL("http://www.youtube.com/");
		
	}
	public static void main(String[]args) throws Exception{
			URL google = new URL("http://www.google.com/");
		   BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()));
		     String inputLine = null;
		    while ((inputLine = reader.readLine()) != null) {
		    	System.out.println(inputLine);
		     
		    }
		 
	}
	
	public String getProtocol() {
		return youtube.getProtocol();
	}
	
	public String getAuthority() {
		return youtube.getAuthority();
	}
	
	public String getHost() {
		return youtube.getHost();
	}

	public int getPort() {
		return youtube.getPort();
	}
	
	public String getQuery() {
		return youtube.getQuery();
	}
	
	public String getPath() {
		return youtube.getPath();
	}
	
	public String getFile() {
		return youtube.getFile();
	}
	
	public String getRef() {
		return youtube.getRef();
	}
	

}
