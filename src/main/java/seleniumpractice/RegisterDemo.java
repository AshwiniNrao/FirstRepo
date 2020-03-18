package seleniumpractice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterDemo {
	@Test
	public void LoginDemo()
	{
					WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("http://services.smartbear.com/samples/TestComplete14/smartstore/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.linkText("LOG IN")).click();
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("gender-female")).click();
			driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Melissa");
			driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Smith");
			Select sdate = new Select(driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]")));
			sdate.selectByVisibleText("13");
			Select smonth = new Select(driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]")));
			smonth.selectByVisibleText("August");
			Select syear = new Select(driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]")));
			syear.selectByVisibleText("1989");
			driver.findElement(By.id("Email")).sendKeys("test12@gmail.com");
			driver.findElement(By.id("Username")).sendKeys("Melisaa");
			driver.findElement(By.id("Password")).sendKeys("test123");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("test123");
			driver.findElement(By.id("Company")).sendKeys("TEST");
			 String NewsLetter = "Yes";
			  if (NewsLetter.equalsIgnoreCase(NewsLetter)){
			  driver.findElement(By.xpath(".//*[@id='Newsletter']")).click();
			  }
			 driver.findElement(By.xpath("//div[@class=\"form-group row\"]//button")).click();
			
			 driver.findElement(By.xpath("//a[@class=\"btn btn-secondary register-continue-button\"]")).click();
			 String RegText = driver.findElement(By.xpath("//div[@class=\"page-body\"]/p]")).getText();
			Assert.assertEquals(RegText, "Your registration completed");
			
			driver.close();
			
	}
		}

