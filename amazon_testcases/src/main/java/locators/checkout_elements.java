package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import utilities.browser_launch;

public class checkout_elements extends browser_launch{
	@FindBy(xpath="//div[@id='CardInstancekWnP-ROJmd5U6wTTj1TGLg']//img[@alt='Clothing']")
	@CacheLookup
	private WebElement clothing;
	
	@FindBy(xpath="//a[@aria-label='7']//img[@alt='7']")
	private WebElement shirt_btn;
	
	@FindBy(xpath="//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2']//img[@alt=\"U.S. POLO ASSN. Men Men's Casual Shirts\"]")
	private WebElement US_polo;
	
	


public  WebElement getclothing() { //instance method /object
	//clothing=driver.findElement(By.xpath(""));
	return clothing;
}

public  WebElement getClickShirt() {
	return shirt_btn;
}
public  WebElement getClickUS_polo() {
	return US_polo;
}
public  WebElement getaddcart() {
	return driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
}
	

public void AddCart(String clothing,String men_shirt) throws InterruptedException {
	getclothing().click();
	Thread.sleep(3000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", shirt_btn);
	getClickShirt().click();
	 Thread.sleep(3000);
	 
	getClickUS_polo().click();
    
	Thread.sleep(3000);
	
	getaddcart().click();
}






}
