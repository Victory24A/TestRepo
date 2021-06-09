package basicJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\asawai\\Documents\\Selenium Jars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		//click on go
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
	
//	driver.switchTo().alert().accept();
//	driver.switchTo().alert().dismiss();
//	driver.switchTo().alert().getText();
//	driver.switchTo().alert().sendKeys("key");
//	
		
		
		
		
	
	
	
	
	}

}
