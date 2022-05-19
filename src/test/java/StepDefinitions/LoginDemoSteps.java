package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginDemoSteps {
	WebDriver driver=null;
	@Given("browser is open for user")
	public void browser_is_open_for_user() {
		System.setProperty("webdriver.chrome.driver","/Users/arunakirannulu/eclipse-workspace/CucumberSeleniumFramework/src/test/resources/Driver/chromedriver2");
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
	}

	@And("user is on login_page")
	public void user_is_on_login_page() throws InterruptedException {
		driver.get("https://example.testproject.io/web/");
		
	}

	@When("user enters  the username and password")
	public void user_enters_the_username_and_password() throws InterruptedException {
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("name")).sendKeys("haritha");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(2000);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		driver.findElement(By.id("login")).click();;
	    driver.close();
	}

}
