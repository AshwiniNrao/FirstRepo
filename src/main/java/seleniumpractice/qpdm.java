package seleniumpractice;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.xml.LaunchSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class qpdm 
{
WebDriver driver;
	@BeforeMethod //launching the browser and navigating to the required url
	void launchBrowser() throws InterruptedException, AWTException, IOException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("  http://qdpm.net/demo/v9/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}
	@Test
	void execute() throws Exception
	{
		//login to the administrator account
		driver.findElement(By.xpath("//div/input[@class=\"form-control placeholder-no-fix required email\"]")).sendKeys("administrator@localhost.com");
		driver.findElement(By.xpath("//input[@class=\"form-control placeholder-no-fix required\"]")).sendKeys("administrator");
		driver.findElement(By.xpath("//button[@class=\"btn btn-info pull-right\"]")).click();
		String pagetitle=driver.getTitle();
		SoftAssert sa1=new SoftAssert();
		sa1.assertEquals(pagetitle,"qdPM 9.0 demo");
		
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
		
		//verifying the options on page 2
		
		String title1=driver.findElement(By.xpath("//span[text()=\"Dashboard\"]")).getText();
		System.out.println(title1);
		SoftAssert s1=new SoftAssert();
		s1.assertEquals(title1,"Dashboard");
		
		String title2=driver.findElement(By.xpath("//span[text()=\"Projects\"]")).getText();
		System.out.println(title2);
		SoftAssert s2=new SoftAssert();
		s2.assertEquals(title2,"Projects");
		
		String title3=driver.findElement(By.xpath("//span[text()=\"Tasks\"]")).getText();
		System.out.println(title3);
		SoftAssert s3=new SoftAssert();
		s3.assertEquals(title3,"Tasks");
		
		String title4=driver.findElement(By.xpath("//span[text()=\"Tickets\"]")).getText();
		System.out.println(title4);
		SoftAssert s4=new SoftAssert();
		s4.assertEquals(title4,"Tickets");
		
		String title5=driver.findElement(By.xpath("//span[text()=\"Discussions\"]")).getText();
		System.out.println(title5);
		SoftAssert s5=new SoftAssert();
		s5.assertEquals(title5,"Discussions");
		
		String title6=driver.findElement(By.xpath("//span[text()=\"Reports\"]")).getText();
		System.out.println(title6);
		SoftAssert s6=new SoftAssert();
		s6.assertEquals(title6,"Reports");
		
		String title7=driver.findElement(By.xpath("//span[text()=\"Users\"]")).getText();
		System.out.println(title7);
		SoftAssert s7=new SoftAssert();
		s7.assertEquals(title7,"Users");
		
		String title8=driver.findElement(By.xpath("//span[text()=\"Configuration\"]")).getText();
		System.out.println(title8);
		SoftAssert s8=new SoftAssert();
		s8.assertEquals(title8,"Configuration");
		
		String title9=driver.findElement(By.xpath("//span[text()=\"Tools\"]")).getText();
		System.out.println(title9);
		SoftAssert s9=new SoftAssert();
		s9.assertEquals(title9,"Tools");
		
		String title10=driver.findElement(By.xpath("//span[text()=\"qdPM Extended\"]")).getText();
		System.out.println(title10);
		SoftAssert s10=new SoftAssert();
		s10.assertEquals(title10,"qdPM Extended");
		//Entering the task details
		
		Select task= new Select(driver.findElement(By.xpath("//select[@id=\"form_projects_id\"]")));
		task.selectByVisibleText("Test Project 1");
		Select tasktype= new Select(driver.findElement(By.xpath("//select[@id=\"tasks_tasks_type_id\"]")));
		tasktype.selectByVisibleText("Defects (Hourly rate $0.00)");
		driver.findElement(By.xpath("//div[@class=\"col-md-9\"]/input[@name=\"tasks[name]\"]")).sendKeys("ashwi");
		Select taskstatus= new Select(driver.findElement(By.id("tasks_tasks_status_id")));
		taskstatus.selectByValue("8");
		Select taskprirority= new Select(driver.findElement(By.id("tasks_tasks_priority_id")));
		taskprirority.selectByValue("3");
		Select tasklabel= new Select(driver.findElement(By.id("tasks_tasks_label_id")));
		tasklabel.selectByValue("4");
		
		driver.findElement(By.id("tasks_assigned_to_2")).click();
		driver.findElement(By.id("tasks_assigned_to_4")).click();
		Select createdby= new Select(driver.findElement(By.id("tasks_created_by")));
		createdby.selectByValue("4");
		driver.findElement(By.xpath("//a[text()=\"Time\"]")).click();
		driver.findElement(By.id("tasks_estimated_time")).sendKeys("11");
		driver.findElement(By.id("tasks_start_date")).sendKeys("2019-12-27");
		driver.findElement(By.id("tasks_due_date")).sendKeys("2019-12-31");
		Select progress= new Select(driver.findElement(By.id("tasks_progress")));
		progress.selectByValue("20");
		
		//uploading the file
		driver.findElement(By.xpath("//a[text()=\"Attachments\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"uploadifive-uploadify_file_upload\"]/input[2]")).sendKeys("C:\\Users\\SriRama\\Desktop\\upload.txt");
		Thread.sleep(1000);
		
		//logout of the account
		driver.findElement(By.xpath("//div[@class=\"modal-footer\"]//button[1]")).click();
		driver.findElement(By.xpath("//a[@href=\"#\"]")).click();
		driver.findElement(By.linkText("Logoff")).click();
		String pagetitle2=driver.getTitle();
		System.out.println(pagetitle2);
		SoftAssert sa2=new SoftAssert();
		sa2.assertEquals(pagetitle,"qdPM 9.0 demo","doesnt match with the expected");
		
		//Re login to the account for verifying the newly added task 
		driver.findElement(By.xpath("//div/input[@class=\"form-control placeholder-no-fix required email\"]")).sendKeys("administrator@localhost.com");
		driver.findElement(By.xpath("//input[@class=\"form-control placeholder-no-fix required\"]")).sendKeys("administrator");
		driver.findElement(By.xpath("//button[@class=\"btn btn-info pull-right\"]")).click();
		driver.findElement(By.linkText("Tasks")).click();
		driver.findElement(By.linkText("View All")).click();
		driver.findElement(By.id("yui-gen1")).click();
		driver.findElement(By.id("search_keywords")).sendKeys("ashwi");
		driver.findElement(By.xpath("//input[@class=\"btn btn-default\"]")).click();
		
		//verifying the task details as entered by the user
		String tdata1=driver.findElement(By.xpath("//tr[@class=\"odd\"]/td[3]")).getText();
		System.out.println(tdata1);
		SoftAssert t1=new SoftAssert();
		t1.assertEquals(t1, "12");
		
		String tdata2=driver.findElement(By.xpath("//tr[@class=\"odd\"]/td[4]")).getText();
		System.out.println(tdata2);
		SoftAssert t2=new SoftAssert();
		t2.assertEquals(t2, "Issue","matched");
		
		String tdata3=driver.findElement(By.xpath("//tr[@class=\"odd\"]/td[5]")).getText();
		System.out.println(tdata3);
		SoftAssert t3=new SoftAssert();
		t3.assertEquals(t3, "ashwi","matched");
		
		String tdata4=driver.findElement(By.xpath("//tr[@class=\"odd\"]/td[6]")).getText();
		System.out.println(tdata4);
		SoftAssert t4=new SoftAssert();
		t4.assertEquals(t4, "Lost","matched");
		
		String tdata5=driver.findElement(By.xpath("//tr[@class=\"odd\"]/td[7]")).getText();
		System.out.println(tdata5);
		SoftAssert t5=new SoftAssert();
		t5.assertEquals(t5, "developer manager","matched");
		
		String tdata6=driver.findElement(By.xpath("//tr[@class=\"odd\"]/td[8]")).getText();
		System.out.println(tdata6);
		SoftAssert t6=new SoftAssert();
		t6.assertEquals(t6, "11","matched");
		
		String tdata7=driver.findElement(By.xpath("//tr[@class=\"odd\"]/td[9]")).getText();
		System.out.println(tdata7);
		SoftAssert t7=new SoftAssert();
		t7.assertEquals(t7, "31 Dec 2019");
		
		String tdata8=driver.findElement(By.xpath("//tr[@class=\"odd\"]/td[10]")).getText();
		System.out.println(tdata8);
		SoftAssert t8=new SoftAssert();
		t8.assertEquals(t8, "Test Project 1");
		
		//deleting the task from the table
		driver.findElement(By.xpath("//a[@class=\"btn btn-default btn-xs purple\"]")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.id("yui-gen26")).click();
		driver.findElement(By.id("search_keywords")).sendKeys("ashwi");
		driver.findElement(By.xpath("//table[@class=\"contentTable\"]//td[2]/input")).click();
		Thread.sleep(1000);
		
		//log-out
		driver.findElement(By.xpath("//a[@href=\"#\"]")).click();
		driver.findElement(By.linkText("Logoff")).click();
	}
	@AfterMethod
	void closeBrowser()
	{
		System.out.println("closing the browser after test");
		driver.close();
	}
	
}
