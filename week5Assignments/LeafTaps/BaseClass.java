package week5Assignments.LeafTaps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public ChromeDriver driver;
	@Parameters({"url" , "usrnm" , "passwd"})
	@BeforeMethod
	public void PreSetup(String url , String usrnm , String passwd ) {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id(usrnm)).sendKeys("Demosalesmanager");
		driver.findElement(By.id(passwd)).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		

	}
	
	@AfterMethod
	public void PostSetup() {
		driver.close();

	}

}
