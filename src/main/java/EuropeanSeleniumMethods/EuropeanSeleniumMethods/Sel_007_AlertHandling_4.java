package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_007_AlertHandling_4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.partialLinkText("Alert with T")).click();
		driver.findElement(By.id("Textbox")).click();
		
		//Alert alert = driver.switchTo().alert();
		//alert.sendKeys("Fatih Ugur");
		//alert.accept();
		sendKeystoAlert(driver,"This is the text");
	}

	public static void sendKeystoAlert(WebDriver driver, String text){
		Alert alert= driver.switchTo().alert();
		alert.sendKeys(text);
		alert.accept();
	}
}
