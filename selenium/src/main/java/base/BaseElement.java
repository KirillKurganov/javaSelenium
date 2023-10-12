package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseElement {
    protected WebDriver driver;
    protected String selector;

    public BaseElement(WebDriver driver, String selector) {
        this.driver = driver;
        this.selector = selector;
    }

    public boolean isDisplayed() {
        return driver.findElement(By.cssSelector(selector)).isDisplayed();
    }

    public String getText() {
        return driver.findElement(By.cssSelector(selector)).getText();
    }
}
