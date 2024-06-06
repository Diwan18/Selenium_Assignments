package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.leafground.com/radio.xhtml");
		
		
		
		 driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		
		 WebElement RadioB = driver.findElement(By.xpath("//input[@id='j_idt87:console1:0']"));
		
		if (!RadioB.isSelected()) {
			RadioB.click();
		}
		
		
		
		System.out.println(RadioB.isSelected());;
		
		WebElement DefaultRadioB = driver.findElement(By.xpath("//input[@id='j_idt87:console2:2']"));
		
		
		WebElement SelectedButton = driver.findElement(By.xpath("//label[text()='Safari']"));
		System.out.println(SelectedButton.getText() + " Is Selected by Default ");
	
		WebElement Age = driver.findElement(By.xpath("//input[@id='j_idt87:age:1']"));
		if (Age.isSelected()) {
			System.out.println(Age.isSelected());}

	}

}
