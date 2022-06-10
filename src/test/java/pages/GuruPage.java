package pages;

import org.bouncycastle.est.LimitedSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class GuruPage {
    public GuruPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Accept All']")
    public WebElement cookies;

    @FindBy(xpath = "//thead//tr//th")
    public List<WebElement> baslikListesi;
}
