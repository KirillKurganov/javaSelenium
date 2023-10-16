package pages;

import base.BasePage;
import controls.Button;
import controls.Input;
import controls.Label;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {
    private String url = "https://the-internet.herokuapp.com/upload";
    private String uploadButtonSelector = "#file-submit";
    private String fileInputSelector = "#file-upload";
    private String uploadedFileTitleSelector = "div#uploaded-files";

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public Button uploadButton() {
        return new Button(this.driver, this.uploadButtonSelector);
    }

    public Input fileInput() {
        return new Input(this.driver, this.fileInputSelector);
    }

    public Label uploadedFileTitle() {
        return new Label(this.driver, this.uploadedFileTitleSelector);
    }

    @Override
    public void navigateTo() {
        this.driver.get(this.url);
        this.uploadButton().waitForElementDisplayed(20);
    }
}
