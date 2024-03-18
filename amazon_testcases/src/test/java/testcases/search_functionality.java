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
import utilities.browser_launch;

public class search_functionality  extends browser_launch{
    //WebDriver driver;

  

    @Test(priority = 1,enabled=false)
    public void testSearchFunctionality() {
       

       

       

        // Validate the search functionality
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("mobiles"), "Search functionality is working fine");
    }

    
}
