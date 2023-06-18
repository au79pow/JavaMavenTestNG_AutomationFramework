import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void testGoogleSearch() {
        // Open Google homepage
        driver.get("https://www.google.com/");

        // Create an instance of GoogleHomePage
        GoogleHomePage homePage = new GoogleHomePage(driver);

        // Perform the search
        homePage.search("selenium webdriver");

        // Create an instance of GoogleSearchResultsPage
        GoogleSearchResultsPage resultsPage = new GoogleSearchResultsPage(driver);

        // Get the first search result title
        //String firstResultTitle = resultsPage.getFirstResultTitle();

        // Verify the result contains the expected keyword
        //Assert.assertTrue(firstResultTitle.toLowerCase().contains("selenium"));
    }
}