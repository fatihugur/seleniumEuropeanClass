package Automation;

import org.openqa.selenium.WebDriver;

public class Automation3_Homework1 {

	public static void main(String[] args) {
		WebDriver driver = null;
		browser(driver, "chrome", "https:/twitter.com/");
		driver.quit();
	}
	
	public static void browser(WebDriver driver, String browser, String url ){
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			} else{
				System.out.println("Invalid browser type");
			}
		 driver.get(url);
	}

}
