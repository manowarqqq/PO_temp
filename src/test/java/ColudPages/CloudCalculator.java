package ColudPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloudCalculator  extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"mainForm\"]/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]/div/div")
    private WebElement computeEngine;


    protected CloudCalculator(WebDriver driver) {
        super(driver);
    }

    public CloudHomePage activateComputeEngine() {
computeEngine.click();
return new CloudHomePage(driver);
    }



    @Override
    protected AbstractPage openPage() {
        return null;
    }
}
