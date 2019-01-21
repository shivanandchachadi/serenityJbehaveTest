package config;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.annotations.Pending;
//import net.thucydides.core.annotations.findby.By;

public class Stepdefclass {
	WebDriver driver;
	
	@Given("the user opens the login page")
	//@Pending
	public void givenTheUserOpensTheLoginPage() throws Exception {
	  // PENDING
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 driver= new ChromeDriver();
		driver.get("https://spimail.spi.com/");
		Thread.sleep(2000);
	}

	@When("the user enters username and password")
	@Pending
	public void whenTheUserEntersUsernameAndPassword() {
	  // PENDING
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("xxxxxx.xxxxxx@xxxxxxx.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("xxxxxxxxxxxx");
	}

	@When("the user clicks login button")
	//@Pending
	public void whenTheUserClicksLoginButton() {
	  // PENDING
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("the home page should be displayed")
	//@Pending
	public void thenTheHomePageShouldBeDisplayed() {
	  // PENDING
		String url=driver.getCurrentUrl();
		String homepageURL="https://spimail.spi.com/#1";
		if(url.equals(homepageURL));
		
	}

	

}
