package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import java.text.MessageFormat;

import static org.testng.Assert.assertTrue;

public class FileUploadTests extends BaseTests {
    private FileUploadPage fileUploadPage;
    private final String pathToFile = MessageFormat
            .format("{0}/data/images/imageUploadTest.jpeg", System.getProperty("user.dir"));

    @Test
    public void fileUploadTest() {
        fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.navigateTo();
        fileUploadPage.fileInput().uploadFile(pathToFile);
        fileUploadPage.uploadButton().click();
        fileUploadPage.uploadedFileTitle().waitForElementDisplayed(20);

        assertTrue(fileUploadPage.uploadedFileTitle().isDisplayed(), "The file title is not displayed");
    }
}
