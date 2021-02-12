package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel_002_WebdriverBasicsFF {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\yavuz\\Downloads\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.siliconlabs.com");
		Thread.sleep(4000);
		
		driver.close();
	}

}
