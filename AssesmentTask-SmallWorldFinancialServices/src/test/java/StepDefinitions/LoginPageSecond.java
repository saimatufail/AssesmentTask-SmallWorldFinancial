package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSecond {
	WebDriver driver;
	WebDriver driverr ;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.get("https://www.saucedemo.com/");
		//throw new io.cucumber.java.PendingException();
	}
	@And("^click on login button$")
    public void clicks_on_login_button() throws InterruptedException
	{
		 WebElement loginButton = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/input[1]"));
    	loginButton.click();
    	 Thread.sleep(5000);
    	//throw new io.cucumber.java.PendingException();
    	
    	}
	@Then("^error message occur for empty credentails$")
	public void error_message_occur()
	{
		
		WebElement errormessage =driver.findElement(By.xpath("//h3[@data-test='error']"));
		if(errormessage.isDisplayed())
		{
			System.out.println("error message is showing");
		}
	}
	
    @When("^user enters valid (.*) and (.*)$")
   public void user_enters_valid_username_and_password(String username ,String password) throws InterruptedException
	{
    	
    	Thread.sleep(5000);
    	
WebElement usernameField = driver.findElement(By.xpath("//input[@id='user-name']"));
       WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
     
 
       usernameField.sendKeys(username);
       passwordField.sendKeys(password);

//    }
	}
    
    @And ("user click on login button")
    public void user_clicks_on_login_button() throws InterruptedException
	{
    	 WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
    	loginButton.click();
    	 Thread.sleep(5000);
    	//throw new io.cucumber.java.PendingException();
    	
    	}

@Then ("user is navigate to home page successfullly")
public void user_is_navigate_to_home_page()
{
	driver.get("https://www.saucedemo.com/inventory.html");
}

@When("user add multiple products in cart")
public void user_add_multiple_product()
{
	WebElement oneproduct = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	oneproduct.click();
	WebElement secondproduct = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
	secondproduct.click();
}


@When("user click on add to cart icon")
public void user_click_on_add_to_cart_icon() throws InterruptedException {
	WebElement addtocarticon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	addtocarticon.click();
	Thread.sleep(5000);
}

@When("user remove products from cart")
public void user_remove_products_from_cart () throws InterruptedException
{
	WebElement removeone = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
	
	WebElement removetwo = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']"));
	
	removeone.click();
	Thread.sleep(5000);
	removetwo.click();
	Thread.sleep(5000);
}

@Then("user logout successfully")
public void user_logout_successfully() throws InterruptedException
{

	WebElement logout = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));

	WebElement logoutone = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
	
	logout.click();
	Thread.sleep(5000);
	logoutone.click();
	
	
}
}


	
