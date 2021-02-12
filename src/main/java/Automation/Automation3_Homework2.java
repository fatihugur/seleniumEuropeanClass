package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation3_Homework2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//accept cookies
		driver.findElement(By.id("u_0_h")).click();
		//email
		driver.findElement(By.id("email")).sendKeys("deneme hesabı");
		//password
		driver.findElement(By.id("pass")).sendKeys("deneme sifre");
		//
		driver.findElement(By.id("u_0_b")).click();
		
	}

}
