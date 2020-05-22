package waiters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
    public static WebDriverWait waitTimeout(WebDriver driver,int timeout) {
        return  new WebDriverWait(driver,timeout);
    }

}
