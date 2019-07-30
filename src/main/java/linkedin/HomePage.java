package linkedin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {super(driver);}

    @FindBy(css = ".nav__button-secondary")
    private WebElement signinbutton;

    public LoginPage clickSignIn() {
        signinbutton.click();
        return new LoginPage(driver);
    }

}
