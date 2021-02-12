package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_015_TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.siliconelabs.com/teachers");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		File src=  driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\yavuz\\Downloads\\ScreenShots\\SC1.png"));
		
	}

}

/*
 package EuropeanSeleniumMethods_2.EuropeanSeleniumMethods_2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_015_TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.siliconelabs.com/teachers");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("/Users/ahmetcturk/Desktop/ScreenShots/SC1.png"));
		

	}

}

 */
