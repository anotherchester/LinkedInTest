package linkedin;

import org.junit.Test;

public class LoginTest extends BaseTest {

    private HomePage homePage;

    @Test
    public void testLogin() {

        homePage = new HomePage(driver);
    }
}
