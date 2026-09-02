package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void productNavigationTest() {

        // Step 1: Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "standard_user",
                "secret_sauce"
        );

        // Step 2: Open product
        ProductPage productPage =
                new ProductPage(driver);

        productPage.openBackpack();

        // Step 3: Validate product name
        Assert.assertEquals(
                productPage.getProductName(),
                "Sauce Labs Backpack",
                "Product name is incorrect"
        );

        // Step 4: Validate price
        Assert.assertTrue(
                productPage.getProductPrice().contains("$"),
                "Product price should be displayed"
        );

        // Step 5: Validate description
        Assert.assertFalse(
                productPage.getProductDescription().isEmpty(),
                "Product description should not be empty"
        );

        // Step 6: Validate availability
        Assert.assertTrue(
                productPage.isProductAvailable(),
                "Product should be available"
        );
    }
}
