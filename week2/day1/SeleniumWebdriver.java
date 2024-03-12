package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdriver {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("demosalesmanager");
	WebElement password =driver.findElement(By.id("password"));
	password.sendKeys("crmsfa");
	WebElement submit =driver.findElement(By.className("decorativeSubmit"));
	submit.click();
	WebElement CRMLink=driver.findElement(By.linkText( "CRM/SFA"));
	CRMLink.click();
	WebElement LeadsTab=driver.findElement(By.linkText("Leads"));
	LeadsTab.click();
	WebElement createLead=driver.findElement(By.linkText("Create Lead"));
	createLead.click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shilpa");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("BN");
	driver.findElement(By.className("smallSubmit")).click();
    String viewLeadTitle = driver.getTitle();
    if(viewLeadTitle.contains("View Lead")) {
    	System.out.println("Lead created successfully");}
    	else {
    		System.out.println("Unable to create lead ");
    	driver.close();
    	}
    }
	
	
		

	}


