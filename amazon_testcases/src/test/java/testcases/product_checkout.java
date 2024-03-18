package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import locators.checkout_elements;

public class product_checkout {
    WebDriver driver;

    
    

    @Test(priority = 1)
    public void testAddToCart() throws InterruptedException {
       

        
        
        // Validate the product is added to the cart
       WebElement cartCount = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
    	Assert.assertEquals(cartCount.getText(), "1", "Product should be added to the cart");
    }
    

}