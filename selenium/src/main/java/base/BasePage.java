package base;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver driver;
    protected String url;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo() {
        this.driver.get(this.url);
    }

    public void refreshPage() {
        this.driver.navigate().refresh();
    }
}
