package test;

import ColudPages.CloudCalculator;
import ColudPages.CloudHomePage;
import ColudPages.CloudSearchResultPage;
import org.testng.annotations.Test;

public class CloudHomePageTest extends BaseTest {


    @Test
    public void test() throws InterruptedException {
        CloudHomePage page= new CloudHomePage(driver).openPage();
    CloudSearchResultPage searchPage= page.getSearchResult("Google Cloud Platform Pricing Calculator");
    Thread.sleep(5000);
    CloudCalculator calc=searchPage.getCalculatorPage();
    Thread.sleep(3000);
    calc.activateComputeEngine();
    Thread.sleep(3000);






    }
}
