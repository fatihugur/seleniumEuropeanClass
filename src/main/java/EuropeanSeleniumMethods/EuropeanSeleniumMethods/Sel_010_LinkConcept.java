package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_010_LinkConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//forgotPsw : // linkText : Forgot your password?
		WebElement element = driver.findElement(By.linkText("Forgot your password?"));
		element.click();
		// Link : OrangeHRM, Inc
		WebElement element2 = driver.findElement(By.partialLinkText("OrangeHRM, I"));
		element2.click();
		//driver.navigate().back();
		//driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.close();
	
	}

}
