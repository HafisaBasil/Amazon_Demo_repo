package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import locators.loginpage;
import utilities.browser_launch;

public class signin_testcase extends browser_launch{
  // public static WebDriver driver;

   

    @Test(description="verify that user is not able to login with invalid credentials",priority = 1)
    public void testInvalidLogin() {
        // Navigate to Amazon website
       // driver.get("https://www.amazon.in/ap/signin");
        
    	loginpage loginpage = new loginpage();
		loginpage.UserLogin("hafisa@gmail.com", "Basil@123");
        
        // Validate the result using TestNG assertions
        WebElement errorMessage = driver.findElement(By.id("auth-error-message-box"));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message should be displayed for invalid login");
    }

    @Test(description="verify that user is able to login with valid crdentials",priority = 2)
    public void testValidLogin() {
    	//driver.get("https://www.amazon.in/ap/signin");
        
    	loginpage loginpage = new loginpage();
		loginpage.UserLogin("hafisahussain123@gmail.com", "Basil@123");
        // Validate the result using TestNG assertions
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.amazon.in/", "Login should be successful for valid credentials");
    }

    
}
