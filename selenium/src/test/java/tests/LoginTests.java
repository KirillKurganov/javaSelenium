package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    private LoginPage loginPage;
    private SecureAreaPage secureAreaPage;
    private final String userName = "tomsmith";
    private final String password = "SuperSecretPassword!";

    @Test(testName = "Verify the logging in to application with correct credentials")
    public void loggingInToAppTest() {
        loginPage = new LoginPage(driver);
        secureAreaPage = new SecureAreaPage(driver);
        loginPage.navigateTo();
        loginPage.userNameInput().type(userName);
        loginPage.passwordInput().type(password);
        loginPage.loginButton().click();
        secureAreaPage.secureAreaLabel().waitForElementDisplayed(10);

        assertTrue(secureAreaPage.secureAreaLabel().isDisplayed(), "Secure area label is not displayed");

        String expectedValue = "Welcome to the Secure Area. When you are done click logout below.";
        assertEquals(secureAreaPage.secureAreaLabel().getText(), expectedValue, "The label text is not correct");
    }
}
