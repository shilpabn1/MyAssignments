package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFacebookAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.linkText("Sign up for Facebook"));
driver.findElement(By.name("firstname")).sendKeys("Shilpa");
driver.findElement(By.name("lastname")).sendKeys("BN");
driver.findElement(By.name("reg_email__")).sendKeys("shilpabn103@gmail.com");
driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shilpabn103@gmail.com");
driver.findElement(By.name("reg_passwd__"));

	}

}
