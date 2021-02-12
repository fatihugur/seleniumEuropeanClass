package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_016_DropDown {

	public static void main(String[] args)throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		//https://www.facebook.com/r.php
		//Locator of dropdown/Month : xpath = "//select[@id='month']"
		driver.findElement(By.id("u_0_1h")).click();
		//alert u_0_1e
		WebElement ddMonElement= driver.findElement(By.xpath("//select[@id='month']"));
		Select ddMontMenu = new Select(ddMonElement);
		ddMontMenu.selectByIndex(3);
		ddMontMenu.selectByVisibleText("Sep");
		ddMontMenu.selectByValue("7");
		//getOptions
		//List<WebElement> options = ddMontMenu.getOptions();
		//for (int i = 0; i < options.size(); i++) {
		//System.out.println(options.get(i).getText());	
		//}
		List<WebElement> options = ddMontMenu.getOptions();
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < options.size(); i++) {
		arrayList.add(options.get(i).getText());	
		}
		Collections.sort(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
			
		}
		
	}

}


/*
 package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;
​
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
​
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
​
import io.github.bonigarcia.wdm.WebDriverManager;
​
public class Sel_016_DropDown_1 {
​
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options_1 = new ChromeOptions();
		options_1.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options_1);
		
		
		driver.get("https://www.facebook.com/r.php");
		
		// Locator of DD/Month : xpath = //select[@id='month']
		
		WebElement ddMonElement = driver.findElement(By.xpath("//select[@id='month']"));
		Select ddMonthMenu = new Select(ddMonElement);
		ddMonthMenu.selectByIndex(3);
		ddMonthMenu.selectByVisibleText("Sep");
		ddMonthMenu.selectByValue("7");
		
		// getOptions
		
		List<WebElement> options = ddMonthMenu.getOptions();
		ArrayList<String> arrayList = new ArrayList<String>();
		for (int i = 0; i < options.size(); i++) {
			arrayList.add(options.get(i).getText());
		}
		Collections.sort(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
	}
​
}
 */
