package ColudPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloudSearchResultPage  extends  AbstractPage {


    @FindBy(xpath = "//div[@class='gs-title']//b[contains(text(),'Calculator')]")
    private WebElement GoogleCloudPlatformPricingCalculatorLink;

    protected CloudSearchResultPage(WebDriver driver) {
        super(driver);
    }

    protected AbstractPage openPage() {
        return null;
    }


    public CloudCalculator getCalculatorPage() {
        GoogleCloudPlatformPricingCalculatorLink.click();
        return new CloudCalculator(driver);
    }
}