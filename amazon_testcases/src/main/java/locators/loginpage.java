package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import utilities.browser_launch;

public class loginpage extends browser_launch{
	@FindBy(xpath="//input[@id='ap_email']")
	@CacheLookup
	private WebElement username;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password;


public  WebElement getusername() { //instance method /object
	username=driver.findElement(By.xpath(""));
	return username;
}

public  WebElement getPassword() {
	return password;
}

public  WebElement getLogin() {
	return driver.findElement(By.xpath("//input[@id='signInSubmit']"));
}
public void UserLogin(String username,String password) {
	getusername().sendKeys(username);
	getPassword().sendKeys(password);
	getLogin().click();
	
}
}