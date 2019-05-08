package baseclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReUsableCodes {
	public static WebDriver driver;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BRINDHA\\Desktop\\New folder\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;

	}

	public void loadUrl(String url) {
		driver.get(url);
	}
	public void valueInsert(WebElement ele, String value) {
		ele.sendKeys(value);

	}
	public void click(WebElement ele) {
		ele.click();

	}
	public void quitBrowser() {
		driver.quit();
	}
	public void title() {
		driver.getTitle();
	}
	public void browserUrl() {
		driver.getCurrentUrl();
	}

}
