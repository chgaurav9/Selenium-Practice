package CucuSwitch;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Parameterization {
	
	@Given("^user is on PackAndGo login page$")
	public void user_is_on_PackAndGo_login_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		System.out.println("in when");
	}

	@When("^user enters the \"([^\"]*)\" and \"([^\"]*)\" credentials$")
	public void user_enters_the_and_credentials(String arg1, String arg2) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		System.out.println(arg1);
		System.out.println(arg2);
	}

	@Then("^user logged in and checks for Edit Profile$")
	public void user_logged_in_and_checks_for_Edit_Profile() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("in then");
	}

	@Then("^user logout from application$")
	public void user_logout_from_application() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		
		System.out.println("in 2 then");
	}



}
