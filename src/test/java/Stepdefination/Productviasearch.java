package Stepdefination;

import com.basetest.qa.base.BaseTest;
import com.category.pages.Productviacategory;
import com.category.pages.Signinpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Productviasearch extends BaseTest {
	
	@SuppressWarnings("unused")
	private Signinpage signinPage;
	private Productviacategory acessProduct;

	@Given("user is on ebay page.")
	public void user_is_on_ebay_page() {
		BaseTest.initialization();
		signinPage =  new Signinpage();
	}
	
	
	
	@Given("User Enters text  {string} & Click on the Search button")
	public void user_enters_text_click_on_the_search_button(String string) {
	   acessProduct = new Productviacategory();
	   acessProduct.NavigatetoProductpage(string);
	}
	
	@Then("the title of the page is {string}")
	public void the_title_of_the_page_is(String title) {
		@SuppressWarnings("unused")
		String title1 = acessProduct.validateProductPageTitle();
	}

	@Then("Change the Category")
	public void change_the_category() {
	    acessProduct.Navigatetocategory();
	}
	
	@Then("the title of the category page is {string}")
	public void the_title_of_category_page_is(String title) {
		String title1 = acessProduct.validateCategoryPageTitle();
	}
	
	@And("the title of search is {string}")
	public void the_tile_of_search_is(String string) {
	    acessProduct.getText(string);
	}
	
	@Then("close the browser")
	public void close_the_browser(){
	    acessProduct.teardown();
	}
	
	
}
