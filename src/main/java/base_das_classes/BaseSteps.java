package base_das_classes;

import cucumber.api.Scenario;
import org.openqa.selenium.WebDriver;
import support.BrowserFactory;

public class BaseSteps {
    public static WebDriver browser;
    public static Scenario cenario;

    public static WebDriver openBrowser() {
        if (browser == null) {
            browser = BrowserFactory.getBrowser();
        }
        return browser;
    }

    public static void closeBrowser() {
        if (browser != null) {
            browser.quit();
            browser = null;
        }
        else if (browser == null){
            browser.quit();
        }
    }
}
