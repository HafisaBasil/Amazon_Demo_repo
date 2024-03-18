package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class search_elements {
  
	@FindBy(xpath="//input[@id='twotabsearchtextbox']\"")
	@CacheLookup
	private WebElement searchField;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement search_btn;
	
	
	
	public  WebElement getsearchfield() { //instance method /object
		//clothing=driver.findElement(By.xpath(""));
		return searchField;
	}

	public  WebElement getSearchBtn() {
		return search_btn;
}
	
	public void searchfcn() {
		getsearchfield().click();
		getsearchfield().sendKeys("mobile");
		
		getSearchBtn().click();
		
	}	
	
}