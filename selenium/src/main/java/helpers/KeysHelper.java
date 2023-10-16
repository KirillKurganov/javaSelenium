package helpers;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysHelper {
    private WebDriver driver;

    public KeysHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void pressKey(String keyName) {
        Actions actionObj = new Actions(driver);

        switch(keyName) {
            case "BACK_SPACE":
                actionObj.sendKeys(Keys.BACK_SPACE).perform();
                break;

            case "SHIFT":
                actionObj.sendKeys(Keys.SHIFT).perform();
                break;

            case "ARROW_LEFT":
                actionObj.sendKeys(Keys.ARROW_LEFT).perform();
                break;

            case "SPACE":
                actionObj.sendKeys(Keys.SPACE).perform();
                break;

            case "ENTER":
                actionObj.sendKeys(Keys.ENTER).perform();
                break;
        }
    }
}
