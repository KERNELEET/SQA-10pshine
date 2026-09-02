package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class HomePage extends BasePage {

    private By productsTitle = By.cssSelector(".title");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductsPageDisplayed() {
        return isDisplayed(productsTitle);
    }

    public String getPageTitle() {
        return getText(productsTitle);
    }
}
