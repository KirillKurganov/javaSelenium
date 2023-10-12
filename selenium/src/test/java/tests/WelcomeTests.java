package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WelcomePage;

import static org.testng.Assert.*;

public class WelcomeTests extends BaseTests {

    private WelcomePage welcomePage;

    @Test(testName = "Verify the \"Examples\" label")
    public void examplesMessageTest() {
        welcomePage = new WelcomePage(driver);
        welcomePage.navigateTo();

        assertTrue(welcomePage.availableExamplesLabel().isDisplayed(), "The examples label is not displayed");
        assertEquals(welcomePage.availableExamplesLabel().getText(), "Available Examples",
                "The label text is not correct");
    }

    @Test(testName = "Verify the \"Welcome message\" label")
    public void welcomeMessageTest() {
        welcomePage.refreshPage();

        assertTrue(welcomePage.welcomeMessage().isDisplayed(), "The welcome label is not displayed");
        assertEquals(welcomePage.welcomeMessage().getText(), "Welcome to the-internet",
                "The label text is not correct");
    }
}
