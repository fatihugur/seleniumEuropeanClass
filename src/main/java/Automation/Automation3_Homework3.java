package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation3_Homework3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	
		//Quick Launch links
		//
		driver.findElement(By.linkText("Assign Leave")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		//
		driver.findElement(By.linkText("Leave List")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		//
		driver.findElement(By.linkText("Timesheets")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		//
		driver.findElement(By.linkText("Apply Leave")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		//
		driver.findElement(By.linkText("My Leave")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		//
		driver.findElement(By.linkText("My Timesheet")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		//quit
		driver.quit();
	}
	
}
