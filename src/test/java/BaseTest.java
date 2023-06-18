import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:/Users/snshr/IdeaProjects/chromedriver.exe");

        // Initialize ChromeDriver instance
        driver = new ChromeDriver();
    }

    @AfterClass
    public void tearDown() {
        // Quit the WebDriver instance
        driver.quit();
    }
}