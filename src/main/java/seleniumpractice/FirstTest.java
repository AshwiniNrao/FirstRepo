package seleniumpractice;
import 


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://qdpm.net/demo/v9/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String ExpectedPageTitle="qdPM } Login";
		String ActualPageTitle=driver.getTitle();
		String url="http://qdpm.net/demo/v9/index.php";
		String currenturl=driver.getCurrentUrl();
		if(ExpectedPageTitle.equalsIgnoreCase(ActualPageTitle))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		if(url.equalsIgnoreCase(currenturl))
			System.out.println("same url");
		else
			System.out.println("different url");
		driver.close();
		
		
	}

	}

