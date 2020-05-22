package test;

import ColudPages.CloudHomePage;
import org.testng.annotations.Test;

public class CloudHomePageTest extends BaseTest {


    @Test
    public void test() throws InterruptedException {
        CloudHomePage page= new CloudHomePage(driver).openPage();
        page.getSearchResult("Google Cloud Platform Pricing Calculator");
        Thread.sleep(20000);




    }
}
