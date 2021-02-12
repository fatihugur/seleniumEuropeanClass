package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_009_NameConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//loginInputBox / name:txtUsername
		//passwordInputBox /name:txtPassword
		//loginButton / name:Submit
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		WebElement passwordInputBox = driver.findElement(By.name("txtPassword"));
		passwordInputBox.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.name("Submit"));
		loginButton.click();
		
		Thread.sleep(7000);
		driver.close();
	}

}
