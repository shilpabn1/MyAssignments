package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
       // driver.findElement(By.xpath("//div[@class='grid formgrid'")).click();
     WebElement AjaxCheckbox =  driver.findElement(By.xpath("//body/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]"));
     AjaxCheckbox.isSelected();
    /* WebElement notificationText =  driver.findElement(By.xpath("//span[contains(text(),'Checked')]"));
     notificationText.click();
     String Note = notificationText.getText();
     if(Note.contains("Checked")) {
     	System.out.println("Lead created successfully");}
     	else {
     		System.out.println("Unable to create lead ");*/
     WebElement selectjava = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]"));
     selectjava.isSelected();
     
     	
     	}
	
	
}