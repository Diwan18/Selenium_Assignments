package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.className("inputBox")).sendKeys("ABC");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohammad");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Diwan");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium_Automation");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.contains("Lead")){
			
			System.out.println("Login Successful");
			
			
		}
		
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
