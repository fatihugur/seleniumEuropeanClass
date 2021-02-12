package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_005_AlertHandling_2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		// id="OKTab"
		driver.findElement(By.id("OKTab")).click();
		Alert alert= driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

}
