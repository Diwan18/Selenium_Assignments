package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_SeleniumAssignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Mohammad007");
		
		
		
		
		
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement db = driver.findElement(By.name("industryEnumId"));
		
		Select options = new Select(db);
		
		options.selectByVisibleText("Computer Software");
		
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		
		Select choice = new Select(Ownership);
		
		choice.selectByVisibleText("S-Corporation");
		
		WebElement Source = driver.findElement(By.id("dataSourceId"));
		
		Select Src = new Select(Source) ;
		
		Src.selectByValue("LEAD_EMPLOYEE");
		
		WebElement MCamp = driver.findElement(By.id("marketingCampaignId"));
		
		Select mcamp = new Select(MCamp);
		
		mcamp.selectByIndex(6);
		
		WebElement StateP = driver.findElement(By.id("generalStateProvinceGeoId"));
		
		Select statep = new Select(StateP);
		
		statep.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String Acc = driver.findElement(By.xpath("//span[contains(text(),'Mohammad')]")).getText();
		System.out.println(Acc);
		
		if(Acc.contains("Mohammad")) {
			
			System.out.println("Account Name is Verified");
		}
		else {System.out.println("Account not matches");}
		
		
		
		
		
		Thread.sleep(5000);
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
