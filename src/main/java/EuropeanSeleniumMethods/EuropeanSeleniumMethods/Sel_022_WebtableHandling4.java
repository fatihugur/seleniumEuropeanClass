package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_022_WebtableHandling4 {

	public static void main(String[] args) throws InterruptedException {
		
		//https://nuix.github.io/senior-sdet/productionCalc/index.html
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://nuix.github.io/senior-sdet/productionCalc/index.html");
		
		//  //input[@value='9'] // rakamlara tıklayıp inputtan xpath aldık
		//driver.findElement(By.xpath("//input[@value='9']")).click();
		//driver.findElement(By.xpath("//input[@value='+']")).click();
		//driver.findElement(By.xpath("//input[@value='9']")).click();
		//driver.findElement(By.xpath("//input[@value='=']")).click();
	    //clickOn(driver, "9");
		//clickOn(driver, "+");
		//clickOn(driver, "9");
		//clickOn(driver, "=");
		
		calculate(driver, "44+99");
		Thread.sleep(5000);
		driver.close();
		//calculate(driver, ""44+99")
		
		
	}
	
	static void calculate(WebDriver driver, String calculation){
		for (int i = 0; i < calculation.length(); i++) {
			String eachChar = Character.toString(calculation.charAt(i));
			//if (eachChar.equals(" ")) {
			//	continue;		
			//}
			clickOn(driver, eachChar);
		}
		clickOn(driver, "=");
	}

	static void clickOn(WebDriver driver, String value){
		driver.findElement(By.xpath("//input[@value='" + value + "']")).click();
	}

}

/* 
 //AHMET HOCANIN YAZIMI
 package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_022_WebtableHandling_4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://nuix.github.io/senior-sdet/productionCalc/index.html");
		
		// //input[@value='9']
		
//		driver.findElement(By.xpath("//input[@value='9']")).click();
//		driver.findElement(By.xpath("//input[@value='+']")).click();
//		driver.findElement(By.xpath("//input[@value='9']")).click();
//		driver.findElement(By.xpath("//input[@value='=']")).click();
//		clickOn(driver, "9");
//		clickOn(driver, "+");
//		clickOn(driver, "9");
//		clickOn(driver, "=");
		
		
		calculate(driver,"44 + 9 9");
		
		Thread.sleep(5000);
		driver.close();
		
	
	}
	
	static void calculate(WebDriver driver, String calculation){
		for (int i = 0; i < calculation.length(); i++) {
			String eachChar = Character.toString(calculation.charAt(i));
			if (eachChar.equals(" ")) {
				continue;		
			}
			clickOn(driver, eachChar);
		}
		clickOn(driver, "=");
	}
	
	static void clickOn(WebDriver driver, String value){
		driver.findElement(By.xpath("//input[@value='" + value + "']")).click();
	}

}
 
 */
