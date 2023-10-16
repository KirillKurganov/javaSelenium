package pages;

import base.BasePage;
import controls.Label;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends BasePage {
    protected String url = "https://the-internet.herokuapp.com/key_presses";
    private String resultLabelSelector = "p#result";
    private String keyPressesTitleSelector = "div h3";

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    public Label resultLabel() {
        return new Label(this.driver, this.resultLabelSelector);
    }

    public Label keyPressesTitle() {
        return new Label(this.driver, this.keyPressesTitleSelector);
    }

    @Override
    public void navigateTo() {
        this.driver.get(this.url);
        this.keyPressesTitle().waitForElementDisplayed(20);
    }
}
