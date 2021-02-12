package EuropeanSeleniumMethods.EuropeanSeleniumMethods;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_011_TagnameConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		//System.out.println(driver.findElements(By.tagName("a")));
		login(driver);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total numbers of link : " + links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());

		}
		driver.findElement(By.linkText("Timesheets")).click();
		
	}
	
	public static void login(WebDriver driver){
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		WebElement passwordInputBox = driver.findElement(By.name("txtPassword"));
		passwordInputBox.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.name("Submit"));
		loginButton.click();
	}

}
