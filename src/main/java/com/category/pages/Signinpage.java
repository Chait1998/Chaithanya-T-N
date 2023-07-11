package com.category.pages;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.basetest.qa.base.BaseTest;
import com.baseutil.util.Baseutil;
public class Signinpage extends BaseTest {
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	
	// 1.POM repository
	
	
	@FindBy(xpath="//li[@class='hl-cat-nav__js-tab hl-cat-nav__js-show']//a[contains(text(),'Electronics')]")
	WebElement Electronics;
	
	@FindBy(xpath="//a[contains(text(),'Cell Phones, Smart Watches & Accessories')]")
	WebElement Cellphone;
	
	@FindBy(xpath="//a[contains(text(),'Cell Phones & Smartphones')]")
	WebElement Smartphone;
	
	@FindBy(xpath="//section[contains(@class,'b-module b-carousel b-guidance b-display--landscape')]//span[contains(text(),'See All')]")
	WebElement SeeAll;
	
	@FindBy(id="c9-mainPanel")
	WebElement leftpanel;
	
	@FindBy(xpath="//span[normalize-space()='Screen Size']")
	WebElement Screen;
	
	@FindBy(id="c3-subPanel-Screen%20Size_Less%20Than%204%20in_cbx")
	WebElement Checkbox;
	
	@FindBy(id="c3-mainPanel-price")
	WebElement Price;
	
	@FindBy(xpath="//input[@aria-label='Minimum Value, US Dollar']")
	WebElement From;
	
	@FindBy(xpath="//input[@aria-label='Maximum Value, US Dollar']")
	WebElement To;
	
	@FindBy(id="c3-mainPanel-location")
	WebElement Location;
	
	@FindBy(xpath="//input[@value='Worldwide']")
	WebElement Radio;
	
	@FindBy(xpath="//button[@aria-label='Apply']")
	WebElement Apply;
	
	@FindBy(xpath="//span[@class='x-tray__count']")
	WebElement Filter;
	
	// 2. Constructor class:
	
	public Signinpage(){
		PageFactory.initElements(driver, this);
	   }
	
	    // Navigate to the Mobile page
	    public void NavigatetoMobilepage()
	    {
	    	Electronics.click();
	    	driver.manage().timeouts().implicitlyWait(Baseutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    	Cellphone.click();
	    	driver.manage().timeouts().implicitlyWait(Baseutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    	Smartphone.click();
	    	driver.manage().timeouts().implicitlyWait(Baseutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    	SeeAll.click();
	    }
	    
	    
	    // Add Filters
	    public void AddFilters(String frm,String to) throws InterruptedException {    	
	    	WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));	
	    	wt.until(ExpectedConditions.elementToBeClickable(Screen)).click();
	    	driver.manage().timeouts().implicitlyWait(Baseutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    	Checkbox.click();
	    	driver.manage().timeouts().implicitlyWait(Baseutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    	js.executeScript("arguments[0].scrollIntoView();", Price);
	    	wt.until(ExpectedConditions.elementToBeClickable(Price)).click();
	    	driver.manage().timeouts().implicitlyWait(Baseutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    	js.executeScript("arguments[0].scrollIntoView();", From);
	    	From.sendKeys(prop.getProperty("frm"));
	    	driver.manage().timeouts().implicitlyWait(Baseutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    	js.executeScript("arguments[0].scrollIntoView();", To);
	    	To.sendKeys(prop.getProperty("to"));
	    	To.sendKeys(Keys.RETURN);
	    	Thread.sleep(100);
	    	wt.until(ExpectedConditions.elementToBeClickable(Location)).click();
	    	driver.manage().timeouts().implicitlyWait(Baseutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	    	Radio.click();
	    	driver.manage().timeouts().implicitlyWait(Baseutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	        Apply.click();
	        
	    }

	  //validating the SiginPage
		   public String validateAddfilter(){
				return driver.getTitle();
			}
		   
		 //close the browser
			public void teardown() {
				driver.quit();
			}
}
		

