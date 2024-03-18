package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class browser_launch extends Global_variables{
	// public static WebDriver driver;
  @BeforeSuite(alwaysRun=true)
  @Parameters("browser")
  public void launch(String browser) {
	  if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			System.out.println("firefox is launched");
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			System.out.println("chrome is launched");
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			System.out.println("edge is launched");
		}
	  driver.get("https://www.amazon.in/ap/signin");
		driver.manage().window().maximize();
	  
	  
	  
	  
	  
  }
  @AfterSuite(alwaysRun=true)
  public void teardown() {
      // Close the browser
      driver.quit();
  }
}
