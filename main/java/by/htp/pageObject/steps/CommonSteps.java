package by.htp.pageObject.steps;

import javax.naming.OperationNotSupportedException;

import by.htp.pageObject.driver.WebDriverWrapper;
import by.htp.pageObject.entity.User;
import by.htp.pageObject.pages.LetterPage;
import by.htp.pageObject.pages.LoginPage;
import by.htp.pageObject.pages.MainPage;
import by.htp.pageObject.pages.UserProfilePage;

public class CommonSteps {

	private WebDriverWrapper driverWrapper;

	public CommonSteps(WebDriverWrapper driverWrapper) {
		this.driverWrapper = driverWrapper;
	}

	public MainPage authorize(String login, String pass) {
		
		LoginPage loginPage = new LoginPage(driverWrapper);

		loginPage.openPage();
		loginPage.logIn(login, pass);

		MainPage mainPage = new MainPage(driverWrapper);
		return mainPage;

	}
	
	public MainPage sendLetter () throws OperationNotSupportedException {
		LetterPage letterPage = new LetterPage (driverWrapper);
		//letterPage.openPage();
		letterPage.sendLetter();
		
		MainPage mainPage = new MainPage(driverWrapper);
		return mainPage;
	
	}

	 public UserProfilePage editProfile (User user) {
	 UserProfilePage page = new UserProfilePage (driverWrapper);
	 return page;
	 }
}
