package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {


    public static enum Browser{
        CHROME, FIREFOX
    }

    public static WebDriver getBrowser() {
        return getBrowser(Browser.CHROME);
    }

    public static WebDriver getBrowser(Browser browserUser) {
        WebDriver resultBrowser;

        switch (browserUser) {
            case CHROME:
                resultBrowser = new ChromeDriver();
                break;
            case FIREFOX:
                resultBrowser = new FirefoxDriver();
                break;
            default:
                resultBrowser = null;
                new Exception("Não é possível carregar o Browser");
        }
        return resultBrowser;
    }
}
