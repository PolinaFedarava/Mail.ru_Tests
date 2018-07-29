package by.htp.pageObject.test;

import javax.naming.OperationNotSupportedException;

import org.testng.annotations.Test;

import by.htp.pageObject.pages.MainPage;

public class LetterTest extends BaseTest {
	String login = "tathtp"; 
	String pass = "Klopik123";
	@Test
	public void testUserCanLogin() {
		MainPage page = steps.authorize(login , pass);
		//assert
	}
	@Test
	public void testUserCanSendLetter() throws OperationNotSupportedException {
		MainPage page = steps.sendLetter();
		//assert
	}
}
