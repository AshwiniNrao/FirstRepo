package seleniumpractice;



import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class vehicleInsurance
{
	@Test
	public void LoginDemo()
	{
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("http://demo.automationtalks.com/index.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//Entering vehicle data
			Select vMake= new Select(driver.findElement(By.xpath("//select[@id=\"make\"]")));
			vMake.selectByVisibleText("Honda");
			Select vModel= new Select(driver.findElement(By.xpath("//select[@id=\"model\"]")));
			vModel.selectByVisibleText("Scooter");
			driver.findElement(By.id("cylindercapacity")).sendKeys("150");
			driver.findElement(By.id("engineperformance")).sendKeys("170");
			driver.findElement(By.id("dateofmanufacture")).sendKeys("05/18/2017");
			Select noOfSeats=new Select(driver.findElement(By.xpath("//select[@id=\"numberofseats\"]")));
			noOfSeats.selectByVisibleText("2");
			driver.findElement(By.xpath("//span[@class=\"ideal-radio\"]")).click();
			Select Nos=new Select(driver.findElement(By.id("numberofseatsmotorcycle")));
			Nos.selectByVisibleText("2");
			Select fuel=new Select(driver.findElement(By.id("fuel")));
			fuel.selectByVisibleText("Petrol");
			driver.findElement(By.id("payload")).sendKeys("100");
			driver.findElement(By.id("totalweight")).sendKeys("150");
			driver.findElement(By.id("listprice")).sendKeys("1200");
			driver.findElement(By.id("licenseplatenumber")).sendKeys("abc123");
			driver.findElement(By.id("annualmileage")).sendKeys("10000");
			String currenttitle=driver.getTitle();
			System.out.println(currenttitle);
			Assert.assertEquals(currenttitle,"Fill Vehicle Data");
			driver.findElement(By.id("nextenterinsurantdata")).click();
			
			//Entering insurance applicant data
			driver.findElement(By.id("firstname")).sendKeys("abc");
			driver.findElement(By.id("lastname")).sendKeys("efg");
			driver.findElement(By.id("birthdate")).sendKeys("07/14/1989");
			driver.findElement(By.xpath("//input[@id=\"genderfemale\"]/following-sibling::span")).click();
			driver.findElement(By.id("streetaddress")).sendKeys("mg rd");
			Select country=new Select(driver.findElement(By.id("country")));
			country.selectByVisibleText("India");
			driver.findElement(By.id("zipcode")).sendKeys("562101");
			driver.findElement(By.id("city")).sendKeys("cbpur");
			Select occupation=new Select(driver.findElement(By.id("occupation")));
			occupation.selectByVisibleText("Unemployed");
			driver.findElement(By.xpath("//input[@id=\"other\"]/following-sibling::span")).click();
			driver.findElement(By.id("website")).sendKeys("www.abc.com");
			driver.findElement(By.id("picture")).sendKeys("picture");
			String currenttitle1=driver.getTitle();
			System.out.println(currenttitle1);
			Assert.assertEquals(currenttitle1,"Fill Insurant Data");
			driver.findElement(By.id("nextenterproductdata")).click();
			
			//Entering product data
			driver.findElement(By.id("startdate")).sendKeys("07/14/2020");
			Select sumOfInsurance=new Select(driver.findElement(By.id("insurancesum")));
			sumOfInsurance.selectByVisibleText("3.000.000,00");
			Select MRating=new Select(driver.findElement(By.id("meritrating")));
			MRating.selectByVisibleText("Super Bonus");
			Select damageSum=new Select(driver.findElement(By.id("damageinsurance")));
			damageSum.selectByVisibleText("Full Coverage");
			driver.findElement(By.xpath("//input[@id=\"EuroProtection\"]/following-sibling::span")).click();
			Select CCar=new Select(driver.findElement(By.id("courtesycar")));
			CCar.selectByVisibleText("Yes");
			String currenttitle2=driver.getTitle();
			System.out.println(currenttitle2);
			Assert.assertEquals(currenttitle2,"Fill Product Data");
			driver.findElement(By.id("nextselectpriceoption")).click();
			
			//entering quote
			driver.findElement(By.xpath("//input[@id=\"selectplatinum\"]/following-sibling::span")).click();
			String currenttitle3=driver.getTitle();
			System.out.println(currenttitle3);
			Assert.assertEquals(currenttitle3,"Choose Price Option");
			driver.findElement(By.id("nextsendquote")).click();
			
			driver.findElement(By.id("email")).sendKeys("athu1@gmail.com");
			driver.findElement(By.id("phone")).sendKeys("0123456789");
			driver.findElement(By.id("username")).sendKeys("atharva1");
			driver.findElement(By.id("password")).sendKeys("Ashwini123");
			driver.findElement(By.id("confirmpassword")).sendKeys("Ashwini123");
			driver.findElement(By.id("Comments")).sendKeys("send quote asap");
			
			
			//confirming the quotation
			driver.findElement(By.id("sendemail")).click();
			driver.close();
}
}
