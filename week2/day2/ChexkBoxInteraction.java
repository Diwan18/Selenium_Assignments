package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChexkBoxInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		WebElement Message = driver.findElement(By.className("ui-growl-title"));
		
		if(Message.isDisplayed()) {System.out.println("The Message is Displayed");}
		else {System.out.println("The Mesaage is not Displayed");}
		
		
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
		//driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
		
		String state = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		
		System.out.println(state + "is selected");	
		
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
		String expectedResult = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		
		System.out.println(expectedResult);
		
		
		if (expectedResult.contains(expectedResult))
		{
			System.out.println("The Expected Message is Displayed");
			}
		else 
		{
			System.out.println("The Expected message is not Displayed");
			}
		WebElement Disabled = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
		
		
		if(Disabled.isSelected()) {System.out.println("The Checkbox is not disabled");}
		else {System.out.println("CheckBox Disabled");}
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[1]/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[2]/div[1]/div[2]")).click();
		
		
		
		
		driver.close();

	}




	}


