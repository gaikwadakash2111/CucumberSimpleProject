package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import utils.BaseClass;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("User is on SauceDemo login page")
    public void user_is_on_login_page() {
        BaseClass.driver.get("https://www.saucedemo.com/");
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_credentials(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        assertTrue(BaseClass.driver.getCurrentUrl().contains("inventory"));
    }
    
    @Then("Error message should be displayed")
    public void Error_message_should_be_displayed() {
    	assertTrue(loginPage.errorMessageIsDisplayed());
    }
    
    @When("User selects specific products")
    public void user_selects_specific_products() throws InterruptedException {
    	loginPage.selectProducts();
    }

    @When("User clicks on cart icon")
    public void user_clicks_on_cart_icon() {
    	loginPage.clickOnCartIcon();
    }

    @Then("User navigates to your cart page")
    public void user_navigates_to_your_cart_page() {
    	//System.out.println(BaseClass.driver.getCurrentUrl());
    	assertEquals("https://www.saucedemo.com/cart.html",BaseClass.driver.getCurrentUrl());
    }
}