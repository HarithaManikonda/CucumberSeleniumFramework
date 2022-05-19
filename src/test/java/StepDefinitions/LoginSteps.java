package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login")
	public void user_is_on_login() {
		System.out.println("Inside Step-user is on loginvvvvvvvvv");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step-user enters username and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Step-clicks on login button");
	}

	@Then("user is navigated to login page")
	public void user_is_navigated_to_login_page() {
		System.out.println("Inside Step-user is navigated to login page");
	}

}
