package by.htp.pageObject.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWrapper {
	private static final String CHROME = "webdriver.chrome.driver";
	private static final String CHROME_PATH = "D:\\driver\\chromedriver.exe";

	private static WebDriverWrapper instance;
	private static WebDriver driver;

	private WebDriverWrapper() {

	}

	static {
		instance = new WebDriverWrapper();
		initWebDriver();
	}

	public static WebDriverWrapper getInstance() {
		return instance;
	}

	public static void stopWebDriver() {
		driver.close();
		driver = null;
	}

	public void openPage(String url) {
		driver.get(url);
	}
	

	public WebElement findByName(String elementName) {
		return driver.findElement(By.name(elementName));
	}
	
	public WebElement findByXpath(String elementXpath) {
		return driver.findElement(By.xpath(elementXpath));
	}
	
	public WebElement findId(String elementId) {
		return driver.findElement(By.id(elementId));
	}
	
//	public WebElement switchTo() {
//		//String id;
//		return (WebElement) driver.switchTo().frame(driver.findElement(By.)));
//	}

	private static void initWebDriver() {
		System.setProperty(CHROME, CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

}
