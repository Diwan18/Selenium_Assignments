package week5Assignments.LeafTaps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class SalesforceAssignment1 extends BaseClassSalesforce {
	@Test
	public  void Salesforce() {

		
		
		driver.findElement(By.xpath("//a[text()='Administrator']")).click();
		
		
        List<WebElement> certifications = driver.findElements(By.xpath("//div[@class='credentials-card_title']//a"));
        System.out.println("Certifications available for Administrator Certifications:");
        for (WebElement cert : certifications) {
            System.out.println(cert.getText());
		
		
		
		

	}

}}
