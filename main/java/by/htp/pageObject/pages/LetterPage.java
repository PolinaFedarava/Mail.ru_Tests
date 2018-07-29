package by.htp.pageObject.pages;

import javax.naming.OperationNotSupportedException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import by.htp.pageObject.driver.WebDriverWrapper;

public class LetterPage extends AbstractPage {

	private static final String LETTER_URL = "https://e.mail.ru/messages/inbox/";
	WebElement buttonSend;
	WebElement addressee;
	WebElement letter;

	public LetterPage(WebDriverWrapper driverWrapper) {
		super(driverWrapper);
	}

	@Override
	public void openPage() throws OperationNotSupportedException {
		driverWrapper.openPage(LETTER_URL);
		;
	}

	public void sendLetter() {
		buttonSend = driverWrapper.findByXpath(" //*[@id='b-toolbar__left']/div/div/div[2]/div/a");
		buttonSend.click();

		addressee = driverWrapper.findByXpath(" //input[@name='Subject']");
		addressee.click();
		addressee.sendKeys("topic");
		
		

		letter = driverWrapper.findByXpath("//div[@id='b-compose']");
		//letter = driverWrapper.switchTo("[@title = '{#aria.rich_text_area}']");
		//letter = driverWrapper.switchTo();
//		letter = driverWrapper.findByXpath(" //body[@id='tinymce']");

	}

}
