package linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[name=\"session_key\"]")
    private WebElement emailOrPhoneField;

    @FindBy(css = "[name=\"session_password\"]")
    private WebElement passwordField;

    @FindBy(css = ".btn__primary--large.from__button--floating")
    private WebElement signInButton;

    public void inputEmail(String email) {
        emailOrPhoneField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}
