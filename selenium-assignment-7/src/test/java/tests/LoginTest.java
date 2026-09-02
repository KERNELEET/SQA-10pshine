package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void invalidLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "wrong_user",
                "wrong_password"
        );

        Assert.assertTrue(
                loginPage.isErrorMessageDisplayed(),
                "Error message should be displayed"
        );
    }

    @Test
    public void successfulLoginTest() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "standard_user",
                "secret_sauce"
        );

        HomePage homePage = new HomePage(driver);

        Assert.assertTrue(
                homePage.isProductsPageDisplayed(),
                "Products page should be displayed"
        );

        Assert.assertEquals(
                homePage.getPageTitle(),
                "Products"
        );
    }
}
