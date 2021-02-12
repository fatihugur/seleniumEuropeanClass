package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		//Create a maven project
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Starts from google.com
		driver.get("http://www.google.com");
		//Navigate learnsdet.com
		driver.navigate().to("http://www.learnsdet.com");
		//Go back to Google
		driver.navigate().back();
		//Forward to learnsdet.com
		driver.navigate().forward();
		//Go back to Google again 
		driver.navigate().back();
		//and refresh the page
		driver.navigate().refresh();
		//Close the browser
		driver.close();
		
	}

}

/*
 Assignment 2:

Create a maven project
Starts from google.com
Navigate learnsdet.com
Go back to Google
Forward to learnsdet.com
Go back to Google again and refresh the page
Close the browser
 */
