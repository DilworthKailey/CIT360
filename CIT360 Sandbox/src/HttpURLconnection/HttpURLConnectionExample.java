/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HttpURLconnection;

/**
 *
 * @author Kailey
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class HttpURLConnectionExample {
    	
	public static void main (String[] args) {
		
		String output = getUrlContents("http://ctcsandbox.midnight-arts.com/");

		System.out.println(output);
	}
	
	private static String getUrlContents(String theUrl) {
		
		StringBuilder content = new StringBuilder();
		
		try {
			URL url = new URL(theUrl);
			URLConnection urlConnection = url.openConnection();

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			
			String line;

			while((line = bufferedReader.readLine()) != null) {			
				content.append(line + "\n");
			}
			bufferedReader.close();
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return content.toString();
	}
}
