package controls;

import base.BaseElement;
import org.openqa.selenium.WebDriver;

public class Button extends BaseElement {
    public Button(WebDriver driver, String selector) {
        super(driver, selector);
    }
}
