package aaaa;

import org.testng.annotations.Test;

public class GetPropertyTest {
	
	@Test
	public void getPropertyTest()
	{
		System.out.println("Read data from the command line");
		
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
		
		
	}

}
