package edu.escuelaing.arsw.networking;
import java.net.*;
import java.io.*;

public class SocketServer {
	public static void main (String [] args) throws IOException{
		
	}
	
	public void leerNumero(int x) throws IOException {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(35000);
		}
		catch (IOException w) {
			System.err.println("No se puede escuchar en el puerto: 35000.");
			System.exit(1);
		}
		Socket clientSocket = null;
		try {
			clientSocket = serverSocket.accept();
		}
		catch(IOException e) {
			System.err.println("Accept failed");
			System.exit(1);
		}
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		int inputLine, outputLine;
		while ((inputLine = in.read())!=0) {
			System.out.println("Mensaje: "+inputLine);
			outputLine =  inputLine;
			out.println(outputLine);

		}
		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
	}
}


