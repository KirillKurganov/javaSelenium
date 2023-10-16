package pages;

import base.BasePage;
import controls.Label;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {
    private final String secureAreaLabelSelector = "h4.subheader";

    public SecureAreaPage(WebDriver driver) {
        super(driver);
    }

    public Label secureAreaLabel() {
        return new Label(this.driver, this.secureAreaLabelSelector);
    }
}
