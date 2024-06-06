package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("4");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//String Id = driver.findElement(By.xpath("//a[text()='11577']")).getText();
		
		Thread.sleep(3000);
		
		
		String ID = driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).getText();
				
		
		System.out.println(ID);
		
		driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='id']")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(ID);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		String records = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		
		
		if(records.contains(records)) {System.out.println(ID + " is deleted" );}
		else {System.out.println("The Records has been found");}
		driver.close();		
		
		
		

	}

}


	

		
