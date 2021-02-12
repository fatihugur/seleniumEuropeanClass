package EuropeanSeleniumMethods.EuropeanSeleniumMethods;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sel_023_ExplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		// Implictly wait ignores NoSuchElementException in given time​
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
			// start button id : start
			driver.findElement(By.xpath("//*[@id='start']/button")).click();
			// Thread.sleep, Explicitlywait
			//10 is the maximum time my program will wait until element is visible
			WebDriverWait wait = new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='finish']/h4"))));
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loading"))));
			System.out.println(driver.findElement(By.xpath("//*[@id='finish']/h4")).getText());
				
	}

}

/*
 import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_023_ExplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		// Implicitly wait ignores NoSuchElementException in given time
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading");
		//This statement waits until 10 seconds. If element appears in 10 seconds, program will interact
		// with element, if element doesn't NoSuchElementException will be thrown
		
		//start button id : start
		// //*[@id="start"]/button
		driver.findElement(By.xpath("//*[@id='start']/button")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		//Thread.sleep, Explicitlywait
		// 10 is the maximum time my program will wait until element is visible
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='finish']/h4"))));
		System.out.println(driver.findElement(By.xpath("//*[@id='finish']/h4")).getText());
		
	
	}

}

 */
