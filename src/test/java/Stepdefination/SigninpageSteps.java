package Stepdefination;

import com.basetest.qa.base.BaseTest;
import com.category.pages.Signinpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninpageSteps extends BaseTest {

	private Signinpage loginPage;
	 

	@Given("user enters to ebay page")
	public void user_clicks_on_Signin_page() {
		BaseTest.initialization();
		loginPage =  new Signinpage();
	}


@And("user navigates to nagivates to Cellphone & Smartphone.")
public void user_navigates_to_nagivates_to_cellphone_smartphone() {
    loginPage.NavigatetoMobilepage();
}

@And("user is on the add the filters {string} & {string}")
public void user_is_on_the_add_the_filters(String frm,String to) throws InterruptedException {
    loginPage.AddFilters(frm, to);
}

@Then("the title of the  page is {string}")
public void the_title_of_the__page_is(String title) {
	String title1 = loginPage.validateAddfilter();
}

@Then("quit the browser")
public void quit_the_browser(){
    loginPage.teardown();
}

	
}
   




