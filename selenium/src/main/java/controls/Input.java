package controls;

import base.BaseElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input extends BaseElement {

    public Input(WebDriver driver, String selector) {
        super(driver, selector);
    }

    public void type(String text) {
        driver.findElement(By.cssSelector(selector)).clear();
        driver.findElement(By.cssSelector(selector)).sendKeys(text);
    }

    public void uploadFile(String path) {
        driver.findElement(By.cssSelector(selector)).sendKeys(path);
    }
}
