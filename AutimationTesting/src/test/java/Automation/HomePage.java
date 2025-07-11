package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getMensSection() {
        return driver.findElement(By.partialLinkText("Mens"));
    }

    public WebElement getWomensSection() {
        return driver.findElement(By.partialLinkText("Womens"));
    }

    public WebElement getCartIcon() {
        return driver.findElement(By.id("cart"));
    }

    public WebElement getFirstProduct() {
        return driver.findElement(By.xpath("(//div[@class='card'])[1]//img"));
    }

    public WebElement getSearchInput() {
        return driver.findElement(By.xpath("//input[@placeholder='Search']"));
    }

    public void clickMensSection() {
        getMensSection().click();
    }

    public void clickWomensSection() {
        getWomensSection().click();
    }
}

