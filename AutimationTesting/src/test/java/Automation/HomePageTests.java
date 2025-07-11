package Automation;

import org.junit.Assert;
import org.junit.Test;

public class HomePageTests extends BaseTest {

    @Test
    public void testMensSectionVisible() {
        HomePage hp = new HomePage(driver);
        Assert.assertTrue(hp.getMensSection().isDisplayed());
    }

    @Test
    public void testClickMensSection() {
        HomePage hp = new HomePage(driver);
        hp.clickMensSection();
        Assert.assertTrue(driver.getCurrentUrl().contains("mens"));
    }

    @Test
    public void testWomensSectionVisible() {
        HomePage hp = new HomePage(driver);
        Assert.assertTrue(hp.getWomensSection().isDisplayed());
    }

    @Test
    public void testClickWomensSection() {
        HomePage hp = new HomePage(driver);
        hp.clickWomensSection();
        Assert.assertTrue(driver.getCurrentUrl().contains("womens"));
    }

    @Test
    public void testCartIconClickable() {
        HomePage hp = new HomePage(driver);
        hp.getCartIcon().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("cart"));
    }

    @Test
    public void testSearchBoxPresent() {
        HomePage hp = new HomePage(driver);
        Assert.assertTrue(hp.getSearchInput().isDisplayed());
    }

    @Test
    public void testAddFirstItemToCart() {
        HomePage hp = new HomePage(driver);
        hp.getFirstProduct().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("product"));
    }

    // Add more tests below...
}

