package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_021_WebtableHandling_3 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		//https://www.tradingview.com/markets/stocks-usa/market-movers-gainers/
		driver.get("https://www.tradingview.com/markets/stocks-usa/market-movers-gainers/");

		//  //*[@id="js-screener-container"]/div[3]/table/tbody/tr[1]/td[1]
		// //*[@id="js-screener-container"]/div[3]/table/tbody/tr[1]/td[2]
		// //*[@id="js-screener-container"]/div[3]/table/tbody/tr[1]/td[3]
		
		
		String beforeXPath = "//*[@id='js-screener-container']/div[3]/table/tbody/tr[1]/td[";
		String afterXPath = "]";
		
		getRow(driver, beforeXPath, afterXPath);
		
		driver.close();

	}
	
	public static void getRow(WebDriver driver, String beforeXPath, String afterXPath){
		for (int i = 1; i <= 11; i++) {
			String actualXpath = beforeXPath + i + afterXPath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.print(element.getText() + "    ");
		}
		System.out.println();
	}

}