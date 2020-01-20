package edu.escuelaing.arsw.networking;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.net.URL;

public class valoresURL {
	
	private URL google;
	
	public valoresURL() throws MalformedURLException {
		
		google = new URL("http://www.google.com/");
		
	}
	public static void main(String[]args) throws Exception{
			
		 
	}
	
	public void leerDatosInternet() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()));
		String inputLine = null;
		while ((inputLine = reader.readLine()) != null) {
		    System.out.println(inputLine);
		     
		    }
	}
	
	public void leerURLUser() throws IOException {
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		PrintWriter writer = new PrintWriter("resultado.html");
		String inputLine = null;
		while ((inputLine = reader.readLine()) != null) {
		    writer.println(inputLine);
		   
		}
		writer.close();
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	}
	public String getProtocol() {
		return google.getProtocol();
	}
	
	public String getAuthority() {
		return google.getAuthority();
	}
	
	public String getHost() {
		return google.getHost();
	}

	public int getPort() {
		return google.getPort();
	}
	
	public String getQuery() {
		return google.getQuery();
	}
	
	public String getPath() {
		return google.getPath();
	}
	
	public String getFile() {
		return google.getFile();
	}
	
	public String getRef() {
		return google.getRef();
	}
	

}
