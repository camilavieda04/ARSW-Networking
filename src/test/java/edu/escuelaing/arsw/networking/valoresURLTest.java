package edu.escuelaing.arsw.networking;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class valoresURLTest {

	@Test
	
	public void deberiaDarValoresURL() throws MalformedURLException  {
		
		valoresURL x = new valoresURL();
		
		System.out.println(x.getAuthority());
		System.out.println(x.getFile());
		System.out.println(x.getHost());
		System.out.println(x.getPath());
		System.out.println(x.getPort());
		System.out.println(x.getProtocol());
		System.out.println(x.getQuery());
		System.out.println(x.getRef());
		
	}
	
	@Test
	public void deberiaDarInformacionURL()throws IOException{
		
		valoresURL x = new valoresURL();
		x.leerDatosInternet();
	}
	
	@Test
	public void deberiaDarInformacionURLNueva() throws IOException{
		valoresURL x = new valoresURL();
		x.leerURLUser();
	}
}
