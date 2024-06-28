package week5Assignments.LeafTaps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class ArchitectCertifications extends BaseClassSalesforce {
	@Test
	public  void ArchitectCert() {
		// TODO Auto-generated method stub
		

		
		driver.findElement(By.xpath("//img[@alt='Salesforce<br/>Architect']")).click();
		
		
		String Abc = driver.findElement(By.xpath("//div[@class='cert-whatIs_description slds-text-align--center slds-container--medium slds-container--center slds-p-bottom--x-large']")).getText();
		System.out.println(Abc);
		
		driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		
		List<WebElement>  certifications = (List<WebElement>) driver.findElements(By.xpath("//div[@class='credentials-card_title']//a"));
		
		
		System.out.println("Certifications available for Administrator Certifications:");
        for (WebElement cert : certifications) {
            System.out.println(cert.getText());
        }

	}

}
