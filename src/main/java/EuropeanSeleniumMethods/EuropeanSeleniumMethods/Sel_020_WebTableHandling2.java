package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_020_WebTableHandling2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		//https://www.w3schools.com/html/html_tables.asp
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		// Company1 = //*[@id="customers"]/tbody/tr[2]/td[1]
		// Contact1 = //*[@id="customers"]/tbody/tr[2]/td[2]
		// Country1 = //*[@id="customers"]/tbody/tr[2]/td[3]
		
		String beforeXPath = "//*[@id='customers']/tbody/tr[2]/td[";
		String afterXPath = "]";
		printCustomerInfo(driver, beforeXPath, afterXPath);
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		System.out.println(rows.size());
		
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		//*[@id="customers"]/tbody/tr[3]/td[3]
		//*[@id="customers"]/tbody/tr[4]/td[3]
				
		String beforeXpath2 = "//*[@id='customers']/tbody/tr[";
		String afterXpath2 = "]/td[3]";
				
		System.out.println(getColumnData(driver, beforeXpath2, afterXpath2));
		driver.close();

		
	}
	
	public static ArrayList<String> getColumnData(WebDriver driver, String beforeXPath, String afterXPath){
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		ArrayList<String> columnData = new ArrayList<String>();
		for (int i = 2; i <= rows.size(); i++) {
			String actualXpath = beforeXPath + i + afterXPath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			columnData.add(element.getText());
		}
		return columnData;
	}

	
	public static void printCustomerInfo(WebDriver driver, String beforeXPath, String afterXPath){
		for (int i = 1; i <= 3 ; i++) {
			String actualXPath = beforeXPath + i + afterXPath;
			WebElement element = driver.findElement(By.xpath(actualXPath));
			System.out.println(element.getText());
	}
	
	}
}

//https://www.tradingview.com/markets/stocks-usa/market-movers-gainers/

/*
 //Ahmet Hoca'nın yazımıyla 

 package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_020_WebtableHandling_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// Company1 = //*[@id="customers"]/tbody/tr[2]/td[1]
		// Contact1 = //*[@id="customers"]/tbody/tr[2]/td[2]
		// Country1 = //*[@id="customers"]/tbody/tr[2]/td[3]
		
		String beforeXPath = "//*[@id='customers']/tbody/tr[4]/td[";
		String afterXPath = "]";
		
		printCustomerInfo(driver, beforeXPath, afterXPath);
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		System.out.println(rows.size());
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		//*[@id="customers"]/tbody/tr[3]/td[3]
		//*[@id="customers"]/tbody/tr[4]/td[3]
		
		String beforeXpath2 = "//*[@id='customers']/tbody/tr[";
		String afterXpath2 = "]/td[3]";
		
		printColumn(driver, beforeXpath2, afterXpath2);
		driver.close();

	}
	public static void printColumn(WebDriver driver, String beforeXPath, String afterXPath){
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		for (int i = 2; i <= rows.size(); i++) {
			String actualXpath = beforeXPath + i + afterXPath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
	}
	
	
	public static void printCustomerInfo(WebDriver driver, String beforeXPath, String afterXPath){
		for (int i = 1; i <= 3; i++) {
			String actualXpath = beforeXPath + i + afterXPath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
	}

} 
 */
/*
 
// İKİNCİ BOLUM
 

 package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_020_WebtableHandling_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		// Company1 = //*[@id="customers"]/tbody/tr[2]/td[1]
		// Contact1 = //*[@id="customers"]/tbody/tr[2]/td[2]
		// Country1 = //*[@id="customers"]/tbody/tr[2]/td[3]
		
		String beforeXPath = "//*[@id='customers']/tbody/tr[4]/td[";
		String afterXPath = "]";
		
		printCustomerInfo(driver, beforeXPath, afterXPath);
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		System.out.println(rows.size());
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		//*[@id="customers"]/tbody/tr[3]/td[3]
		//*[@id="customers"]/tbody/tr[4]/td[3]
		
		String beforeXpath2 = "//*[@id='customers']/tbody/tr[";
		String afterXpath2 = "]/td[3]";
		
		System.out.println(getColumnData(driver, beforeXpath2, afterXpath2));
		driver.close();

	}
	public static ArrayList<String> getColumnData(WebDriver driver, String beforeXPath, String afterXPath){
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		ArrayList<String> columnData = new ArrayList<String>();
		for (int i = 2; i <= rows.size(); i++) {
			String actualXpath = beforeXPath + i + afterXPath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			columnData.add(element.getText());
		}
		return columnData;
	}
	
	
	public static void printCustomerInfo(WebDriver driver, String beforeXPath, String afterXPath){
		for (int i = 1; i <= 3; i++) {
			String actualXpath = beforeXPath + i + afterXPath;
			WebElement element = driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
		}
	}

}
 */
