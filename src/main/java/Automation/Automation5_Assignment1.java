package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation5_Assignment1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.designmantic.com/");
		WebElement Element1 = driver.findElement(By.xpath("//*[@id=\"selectservice\"]"));
		Select selecet1 = new Select(Element1);
		selecet1.selectByValue("card");
		WebElement Element2 = driver.findElement(By.xpath("//*[@id=\"company_name\"]"));
		Element2.sendKeys("appwise-wisemen");
		WebElement Element3 = driver.findElement(By.xpath("//*[@id=\"details_categories\"]"));
		Select select2 = new Select(Element3);
		select2.selectByValue("13");
		WebElement Element4 = driver.findElement(By.xpath("//*[@id=\"btnlogo2\"]/span"));
		Element4.click();
		//driver.close();
	
	}

}


/*
Assignment 1

Go to https://www.designmantic.com/
Find Logo Maker Tool Online section
Select Business card from step 1
Enter a company name from step 2
Select Industry type from step 3
Click on show my design free button
*/