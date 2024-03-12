package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
		//Launch the browser
				ChromeDriver driver1 = new ChromeDriver();
				
				//To load the url
				driver1.get("http://leaftaps.com/opentaps/");
				
				//To maximize the window
				driver1.manage().window().maximize();
				
				// Locate the Username field
				//Datatype variable = value
				WebElement username = driver1.findElement(By.id("username"));// ctrl+2, l --> shortcut to assign into a variable
				
				//Enter the username as Demosalesmanager
				username.sendKeys("Demosalesmanager");
				
				//Locate the password field and enter the password as crmsfa
				driver1.findElement(By.id("password")).sendKeys("crmsfa");
				
				//locate the login button and click
				driver1.findElement(By.className("decorativeSubmit")).click();
				
				//Locate the CRM/SFA link and click
				driver1.findElement(By.linkText("CRM/SFA")).click();
				
				//To stop our execution for 2second which is 2000milliSeconds
				//Thread.sleep(2000);
				
				//To close the window
				//driver1.close();
				
				
		

	}

}
