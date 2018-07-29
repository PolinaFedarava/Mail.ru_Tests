package by.htp.pageObject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import by.htp.pageObject.pages.LetterPage;
import by.htp.pageObject.pages.LoginPage;
import by.htp.pageObject.pages.MainPage;

public class SimpleTest extends BaseTest {
//	private static final String CHROME = "webdriver.chrome.driver";
//	private static final String CHROME_PATH = "D:\\driver\\chromedriver.exe";
//	private WebDriver driver;
	private String login = "tathtp";
	private String pass = "Klopik123";
	
//	@BeforeTest
//	public void initdriver() {
//		System.setProperty(CHROME, CHROME_PATH);
//		driver = new ChromeDriver();
//	}

	@Test
	public void logInTest() {
//		LoginPage page = new LoginPage(driverWrapper);
//		page.openPage();
//		page.logIn(login, password);
		MainPage page = steps.authorize(login , pass);
		}
		//MainPage mainPage = new MainPage(driver);}
//	@Test
//	public void trySendLetter () {
//		LetterPage pageLetter = new LetterPage(driverWrapper);
//		pageLetter.sendLetter();
//	}
	
	
		
		

}
