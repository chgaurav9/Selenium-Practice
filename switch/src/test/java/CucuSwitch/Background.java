package CucuSwitch;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Background {

	@Given("^User is on EDU Teller Login Page$")
	public void user_is_on_EDU_Teller_Login_Page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		System.out.println("in back ground");
		
	}

	@When("^User checks for Add Money$")
	public void user_checks_for_Add_Money() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		
		System.out.println("in 1 when");
	}

	@Then("^Enter Account number details and Search$")
	public void enter_Account_number_details_and_Search() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.out.println("in 1 then");
	}

	@Then("^Closes$")
	public void closes() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		System.out.println("in 1 close");
	}

	@When("^The user checks for My Customers link$")
	public void the_user_checks_for_My_Customers_link() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("in 2 when");
	    
	}

	@Then("^All Customer details displayed$")
	public void all_Customer_details_displayed() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		System.out.println("in 2 then");
	}

	
	 @Then("^Closes The Browser$") public void closes_The_Browser() throws
	  Exception { // Write code here that turns the phrase above into concrete ctions // throw new PendingException();
	  
	  System.out.println("2 close"); }
	 

}
