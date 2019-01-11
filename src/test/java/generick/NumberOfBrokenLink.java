package generick;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NumberOfBrokenLink {
	int count;
	public void getTheLink(String url)
	{

			URL u;
			try
			{
				u = new URL(url);
				HttpURLConnection http =(HttpURLConnection)u.openConnection();
				http.setConnectTimeout(5000);
				http.connect();
				if(http.getResponseCode()==200)
				{
					System.out.println(url+" "+http.getResponseMessage());
				}
				else if(http.getResponseCode()==404)
				{
					System.out.println(url+" "+http.getResponseMessage());
					count++;
				}
				
			} 
			
			catch (MalformedURLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	public int getCount()
	{
		return count;
	}

}
