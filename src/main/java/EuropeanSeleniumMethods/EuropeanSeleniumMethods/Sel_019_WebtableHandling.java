package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_019_WebtableHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		//https://www.w3schools.com/html/html_tables.asp
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		// Company1 = //*[@id="customers"]/tbody/tr[2]/td[1]
		// Contact1 = //*[@id="customers"]/tbody/tr[2]/td[2]
		// Country1 = //*[@id="customers"]/tbody/tr[2]/td[3]
		
		String beforeXpath = "//*[@id='customers']/tbody/tr[2]/td[";
		String afterXpath = "]";
		for (int i = 1; i <= 3 ; i++) {
			String actualXpath = beforeXpath + i +afterXpath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		driver.close();
		
		
	}

}
