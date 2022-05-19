package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookDemoSteps 
{
	WebDriver driver;
	@Before(order=1)
	public void browserSetup()
	{
		System.out.println("I am inside the browser");
		System.setProperty("webdriver.chrome.driver","/Users/arunakirannulu/eclipse-workspace/CucumberSeleniumFramework/src/test/resources/Driver/chromedriver2");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
	@Before(order=0)
	public void browserSetup2()
	{
		
		System.out.println("I am inside the browser setup2");
	}
	@After(order=1)
	public void teardown()
	{
		//driver.quit();
		driver.close();
		System.out.println("I am inside teardown");

	}
	@After(order=2)
	public void teardown2()
	{
		System.out.println("I am inside teardown2 \n");
	}
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("I am inside BeforeStep***");
	}
	@AfterStep
	public void afterStep()
	{
		System.out.println("I am inside @AfterStep***");
	}
	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("user enters username and password in loginpage")
	public void user_enters_username_and_password_in_loginpage() {
		// Write code here that turns the phrase above into concrete actions
	}

	@And("clicks on login button in loginpage")
	public void clicks_on_login_button_in_loginpage() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("user is navigated to the login page")
	public void user_is_navigated_to_the_login_page() {
		// Write code here that turns the phrase above into concrete actions
	}

}
