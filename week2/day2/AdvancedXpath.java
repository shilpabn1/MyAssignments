package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		//Parent to immidiate child
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("demosalesmanager");
		//grandparent to  grandchild
		driver.findElement(By.xpath("//input[@id='username']/following::input")).sendKeys("crmsfa");
		//grand parent to grand child
		driver.findElement(By.className("decorativeSubmit")).click();
		
	
	   
		
		


	}

}
