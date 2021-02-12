package EuropeanSeleniumMethods.EuropeanSeleniumMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sel_001_WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {
		
		// Set environment for my driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yavuz\\Downloads\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);
		driver.quit();
	}

}
