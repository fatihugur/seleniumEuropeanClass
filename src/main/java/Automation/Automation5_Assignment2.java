package Automation;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation5_Assignment2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tradingview.com/markets/stocks-usa/market-movers-gainers/");
		
		String beforeXPath = "//*[@id=\"js-screener-container\"]/div[3]/table/tbody/tr[4]/td[";
		String afterXPath = "]";
		String beforeXPath2 = "//*[@id=\"js-screener-container\"]/div[3]/table/tbody/tr[";
		String afterXPath2 = "]";
		getRow(driver, beforeXPath, afterXPath);
		getColumnDate(driver, beforeXPath2, afterXPath2);
		driver.close();
		//*[@id="js-screener-container"]/div[3]/table/tbody/tr[1]
		//*[@id="js-screener-container"]/div[3]/table/tbody/tr[2]
		//*[@id="js-screener-container"]/div[3]/table/tbody/tr[3]	
	}
	public static ArrayList<String> getColumnDate(WebDriver driver, String beforeXPath, String afterXPath){
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"js-screener-container\"]/div[3]/table/tbody/tr"));
		ArrayList<String> columnDate = new ArrayList<String>();
		for (int i = 2; i <= 11; i++) {
			String actualXpath = beforeXPath + i + afterXPath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
		return columnDate;
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