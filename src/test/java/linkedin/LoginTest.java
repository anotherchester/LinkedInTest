package linkedin;

import org.junit.Test;

public class LoginTest extends BaseTest {

    private HomePage homePage;
    private LoginPage loginPage;

    @Test
    public void testLogin() {

        homePage = new HomePage(driver);
        homePage.clickSignIn();
        loginPage = new LoginPage(driver);
        loginPage.inputEmail("ocherniaev@gmail.com");
        loginPage.inputPassword("Password");
        loginPage.clickSignInButton();
    }
}
