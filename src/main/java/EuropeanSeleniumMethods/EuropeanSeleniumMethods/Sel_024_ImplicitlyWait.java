package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_024_ImplicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com/dynamic-properties");
		
		// Implicitlywaits waits maximum given second until  element is visible in the html
		// If the elements are located after certain time frame, implicitly wait is best to use.
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("visibleAfter")).click();
		driver.close();
	}

}
