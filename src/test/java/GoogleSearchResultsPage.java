import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchResultsPage {
    private WebDriver driver;

    @FindBy(css = "h3 > a")
    private WebElement firstResultLink;

    public GoogleSearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    public String getFirstResultTitle() {
//        return firstResultLink.getText();
//    }
}