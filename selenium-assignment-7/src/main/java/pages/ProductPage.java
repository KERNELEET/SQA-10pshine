package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class ProductPage extends BasePage {

    private By backpackProduct =
            By.id("item_4_title_link");

    private By productName =
            By.cssSelector(".inventory_details_name");

    private By productPrice =
            By.cssSelector(".inventory_details_price");

    private By productDescription =
            By.cssSelector(".inventory_details_desc");

    private By addToCartButton =
        By.cssSelector("button[id^='add-to-cart']");


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void openBackpack() {
        click(backpackProduct);
    }

    public String getProductName() {
        return getText(productName);
    }

    public String getProductPrice() {
        return getText(productPrice);
    }

    public String getProductDescription() {
        return getText(productDescription);
    }

    public boolean isProductAvailable() {
        return isDisplayed(addToCartButton);
    }
}