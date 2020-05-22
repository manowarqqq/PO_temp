package ColudPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static waiters.Waiter.waitTimeout;

public class CloudHomePage extends AbstractPage {

    private final static String HOME_URL = "https://cloud.google.com";

@FindBy(xpath = "//*[@project-name]")
private WebElement test;

    @FindBy(xpath = "//button[@class='devsite-search-button devsite-header-icon-button button-flat material-icons'][@search-close]")
    private WebElement searchButton;


    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchField;


    public CloudHomePage(WebDriver driver) {
        super(driver);
    }


    public CloudHomePage openPage() {
        driver.get(HOME_URL);
        waitTimeout(driver, WAIT_TIMEOUT_SECONDS);
        return this;
    }

    public CloudSearchResultPage getSearchResult(String term) throws InterruptedException {
        Thread.sleep(2000);
        test.click();
        Thread.sleep(5000);
       searchField.sendKeys(term);
        searchField.sendKeys(Keys.ENTER);
        return  new CloudSearchResultPage(driver);


    }

}
