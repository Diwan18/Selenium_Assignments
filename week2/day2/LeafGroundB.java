package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://leafground.com/button.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		String Title = driver.getTitle();
		
		System.out.println(Title);
		
		driver.navigate().back();
		
		WebElement ButtonDisabled = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']"))  ;
		

		System.out.println(ButtonDisabled.isEnabled());
		
		WebElement Location = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']"));
		System.out.println(" The position of the Submit Button is  " + Location.getLocation());
		
		String Color = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).getCssValue("color");
		
		System.out.println("The Color of the Button is "  + Color);
		

		
		Dimension Size = driver.findElement(By.xpath("//span[text()='Submit']")).getSize();
		
		System.out.println(" The Height and width of the Button is "+Size);
		driver.close();

	}

}
