package pages;

import base.BasePage;
import controls.Button;
import controls.Input;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    protected String url = "http://the-internet.herokuapp.com/login";
    private final String userNameInputSelector = "input#username";
    private final String passwordInputSelector = "input#password";
    private final String loginButtonSelector = "button[type=\"submit\"]";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public Input userNameInput() {
        return new Input(this.driver, this.userNameInputSelector);
    }

    public Input passwordInput() {
        return new Input(this.driver, this.passwordInputSelector);
    }

    public Button loginButton() {
        return new Button(this.driver, this.loginButtonSelector);
    }

    @Override
    public void navigateTo() {
        this.driver.get(this.url);
    }
}
