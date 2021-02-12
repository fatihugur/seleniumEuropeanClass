package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import javax.security.auth.x500.X500Principal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_006_AlertHandling_3 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.partialLinkText("Alert with OK & C")).click();
		driver.findElement(By.id("CancelTab")).click();
		//Handle the alert, press cancel - dismiss()
		//dismissAlert(driver);
		//acceptAlert(driver);
		ElementUtil.acceptAlert(driver);
		
		
	}
	/*//bunları ElementUtil classı içine taşıyıp çağırdık
	 * /acceptAlert(driver); yerine ElementUtil.acceptAlert(driver); diye çağırdık
		
	//ALERT FUNCTIONS
	public static void acceptAlert(WebDriver driver){
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
	}
	
	public static void dismissAlert(WebDriver driver){
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.dismiss();
	}*/
	
	}

