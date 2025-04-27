package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(BaseClass.driver, this);
    }

    @FindBy(id = "user-name")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login-button")
    WebElement loginButton;
    
    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement errorMessage;
    
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement product1;
    
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement product2;
    
    @FindBy(xpath = "//a[@data-test='shopping-cart-link']")
    WebElement cartIcon;

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

	public boolean errorMessageIsDisplayed() {
		return errorMessage.isDisplayed();
	}

	public void selectProducts() throws InterruptedException {
		product1.click();
		Thread.sleep(1000);
		product2.click();
	}

	public void clickOnCartIcon() {
		cartIcon.click();
	}

}