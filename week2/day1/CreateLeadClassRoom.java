package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.it.Date;

public class CreateLeadClassRoom {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName"));
		driver.findElement(By.id("createLeadForm_firstName"));
		driver.findElement(By.id("createLeadForm_lastName"));
		WebElement createLeadFormWE=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select createLeadFormDD=new Select(createLeadFormWE);
		createLeadFormDD.selectByValue("LEAD_COLDCALL");
		WebElement OwnerWE=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipEnum=new Select(OwnerWE);
		ownershipEnum.selectByIndex(2);
		WebElement birthDateWE=driver.findElement(By.id("createLeadForm_birthDate-button"));
		birthDateWE.sendKeys("14/03/24");
	
		

	}

}
