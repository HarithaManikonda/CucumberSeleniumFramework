package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class GoogleSearchSteps {
	
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
		// Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver","/Users/arunakirannulu/eclipse-workspace/CucumberJava/src/test/resources/Driver/chromedriver2");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
	}

	@And("user is on google page")
	public void user_is_on_google_page() 
	{
		
        driver.get("https://google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		
		driver.findElement(By.name("q")).sendKeys("haritha");
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
	}

	@Then("user is navigated to the search results page")
	public void user_is_navigated_to_the_search_results_page() 
	{
		driver.close();
	}

}
