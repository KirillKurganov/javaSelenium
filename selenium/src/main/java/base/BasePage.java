package base;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;
    protected String url = "";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo() {
        driver.get(this.url);
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }
}
