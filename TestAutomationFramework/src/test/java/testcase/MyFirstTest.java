package testcase;

//import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import base.BaseTest;

public class MyFirstTest extends BaseTest {

	@Test
	
	public static void LoginTest() throws InterruptedException
	
	{
		System.out.println("Clicked Successfully");
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("login_id")).sendKeys("cjoylin@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		Thread.sleep(4000);
		String passWord = decodePassword("VGVzdEF1dG9tYXRpb24=");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passWord);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Sign in')]")).click();
		Thread.sleep(4000);
	}
	
	
	}

