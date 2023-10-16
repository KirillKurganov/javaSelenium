package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BaseElement {
    protected WebDriver driver;
    protected String selector;

    public BaseElement(WebDriver driver, String selector) {
        this.driver = driver;
        this.selector = selector;
    }

    //Actions

    public void click() {
        this.driver.findElement(By.cssSelector(this.selector)).click();
    }

    public boolean isDisplayed() {
        return this.driver.findElement(By.cssSelector(this.selector)).isDisplayed();
    }

    //Verifications
    public String getText() {
        return this.driver.findElement(By.cssSelector(this.selector)).getText();
    }

    public boolean containsText(String expectedValue) {
        return this.driver.findElement(By.cssSelector(this.selector)).getText().contains(expectedValue);
    }

    //Waits
    public void waitForElementDisplayed(int time) {
        WebDriverWait wait = new WebDriverWait(this.driver, time > 0 ? Duration.ofSeconds(time) : Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.cssSelector(this.selector))));
    }
}
