package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_003_WebDriverManager {

	public static void main(String[] args) {
		// This class demonstrates web driver manager concept
		// we use drivers online
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.siliconelabs.com");
		
		//Navigate Method
		//Navigate methods provides extra methods
		//navigate.to() vs get () get method wait until web page is load, navigate to doesn't
		driver.navigate().to("http://www.amazon.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		// manage()-windows()-maximize(), fullscreen,
		driver.manage().deleteAllCookies(); // deletes all cookies
		
		driver.manage().window().fullscreen(); // full screen -browser
		driver.manage().window().maximize(); // maximize window-browser
	
	}

}
