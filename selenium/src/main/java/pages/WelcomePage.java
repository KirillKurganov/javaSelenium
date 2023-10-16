package pages;

import base.BasePage;
import controls.Label;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage {
    protected String url = "https://the-internet.herokuapp.com";
    String welcomeMessageSelector = "h1.heading";
    String availableExamplesLabelSelector = "h1+h2";

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    public Label welcomeMessage() {
        return new Label(this.driver, this.welcomeMessageSelector);
    }

    public Label availableExamplesLabel() {
        return new Label(this.driver, this.availableExamplesLabelSelector);
    }

    @Override
    public void navigateTo() {
        this.driver.get(this.url);
    }
}
