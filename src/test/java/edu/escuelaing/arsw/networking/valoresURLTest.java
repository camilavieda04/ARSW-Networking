package edu.escuelaing.arsw.networking;

import java.net.MalformedURLException;

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
	
}
