package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_013_CSSSelector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		Sel_011_TagnameConcept.login(driver);
		// We get the CSS selector from selector'shub extension.
		driver.findElement(By.cssSelector("a[id='menu_directory_viewDirectory'] b")).click();;
	
	}

}
