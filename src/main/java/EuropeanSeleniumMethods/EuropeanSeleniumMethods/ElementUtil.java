package EuropeanSeleniumMethods.EuropeanSeleniumMethods;

import java.sql.Driver;

import javax.security.sasl.AuthorizeCallback;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.asm.Advice.This;

public class ElementUtil {
	
	//ALERT FUNCTIONS
	/**
	 *
	 * @param driver
	 * @author fatihugur
	 */
		public static void acceptAlert(WebDriver driver){
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println(alertText);
			alert.accept();
		}
		/**
		 * This method switches driver into alert and print 
		 * the text,accept the alert
		 * @param driver
		 * @author fatihugur
		 */
		
		public static void dismissAlert(WebDriver driver){
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println(alertText);
			alert.dismiss();
		}
		/**
		 * 
		 * @param driver
		 blyy * @author fatihugur
		 * @param text
		 */
		
		public static void sendKeystoAlert(WebDriver driver, String text){
			Alert alert= driver.switchTo().alert();
			alert.sendKeys(text);
			alert.accept();
		}

}
