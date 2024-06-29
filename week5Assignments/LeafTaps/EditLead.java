package week5Assignments.LeafTaps;


	
	import java.io.IOException;
import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class EditLead extends BaseClass {
		
		@DataProvider(name="getValue")
		public String[][] data() throws IOException{
			

			
			return ExcelSheet2.readexcel();
			
			
			
		}
		
		
		
		@Test(dataProvider="getValue")

		
		public  void editLead(String phNo) {

			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Edit")).click();
			WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
			companyName.clear();
			companyName.sendKeys("TCS");
			driver.findElement(By.name("submitButton")).click();
			String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			if (text.contains("TCS")) {
				System.out.println("Lead is editted successfully");
			}
			else {
				System.out.println("Lead is not editted");
			}
			


		}

	}



