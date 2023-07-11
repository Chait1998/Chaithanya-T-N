package com.category.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basetest.qa.base.BaseTest;

public class Productviacategory extends BaseTest {
	
	// POM Page
	
	@FindBy(xpath="//input[@id='gh-ac']")
	WebElement Text;
	
	@FindBy(xpath="//input[@id='gh-btn']")
	WebElement Search;
	
	@FindBy(xpath="//span[normalize-space()='Computers/Tablets & Networking']")
	WebElement Category;
	
	
	// Constructor class:
	public Productviacategory(){
		PageFactory.initElements(driver, this);
	   }
	
	//Navigate to productPage
	public void NavigatetoProductpage( String laptop) {
		Text.sendKeys(prop.getProperty("name"));
		Search.click();
		
	}
	
    // Validate product title page
	public String validateProductPageTitle(){
		return driver.getTitle();
	} 
	
	//navigate to link of Category
	public void Navigatetocategory( ) {
		Category.click();		
	}
	
	// Validate the Title of the  CategoryPage
	public String validateCategoryPageTitle(){
		return driver.getTitle();
	} 
	public  String getText(String text) {
		String text1 = Text.getAttribute(text);
		assertEquals(text1, "Macbook");
		return text1;
		
	}
	
	//close the browser
	public void teardown() {
		driver.quit();
	}
	private void assertEquals(String text1, String string) {
		// TODO Auto-generated method stub	
	}
}
