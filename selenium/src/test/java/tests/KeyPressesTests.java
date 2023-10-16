package tests;

import base.BaseTests;
import helpers.KeysHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.KeyPressesPage;
import java.text.MessageFormat;

import static org.testng.Assert.*;

public class KeyPressesTests extends BaseTests {
    private KeyPressesPage keyPressesPage;
    private KeysHelper keysHelper;

    @DataProvider(name = "keysDataProvider")
    public Object[][] keysDataProvider() {
        Object[][] keys = new Object[5][2];

        keys [0] [0] = "BACK_SPACE";
        keys [0] [1] = "BACK_SPACE";

        keys [1] [0] = "SHIFT";
        keys [1] [1] = "SHIFT";

        keys [2] [0] = "ARROW_LEFT";
        keys [2] [1] = "LEFT";

        keys [3] [0] = "SPACE";
        keys [3] [1] = "SPACE";

        keys [4] [0] = "ENTER";
        keys [4] [1] = "ENTER";

        return keys;
    }

    @BeforeMethod
    public void keyPressesTestBeforeBlock() {
        keyPressesPage = new KeyPressesPage(driver);
        keysHelper = new KeysHelper(driver);
        keyPressesPage.navigateTo();
    }


    @Test(
            testName = "Verify the pressed keys are displayed correctly by the system",
            dataProvider = "keysDataProvider"
    )
    public void keyPressesTest(String keyName, String keyTitle) {
        keysHelper.pressKey(keyName);

        assertTrue(keyPressesPage.resultLabel().isDisplayed(), "The \"Result\" label is not displayed");
        assertTrue(keyPressesPage.resultLabel().containsText(keyTitle),
                MessageFormat.format("The key {0} title is not displayed", keyTitle));
    }

}
