import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage {
    private WebDriver driver;

    @FindBy(name = "q")
    private WebElement searchBox;

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void search(String keyword) {
        searchBox.sendKeys(keyword);
        searchBox.sendKeys(Keys.ENTER);
    }
}