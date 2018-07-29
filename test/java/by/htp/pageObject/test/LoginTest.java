package by.htp.pageObject.test;

import org.testng.annotations.Test;

import by.htp.pageObject.pages.MainPage;

public class LoginTest extends BaseTest {
	String login = "tathtp"; 
	String pass = "Klopik123";
	@Test
	public void testUserCanLogin() {
		MainPage page = steps.authorize(login , pass);
		//assert
	}
}
