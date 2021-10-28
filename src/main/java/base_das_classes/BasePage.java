package base_das_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver browser;
    protected WebDriverWait wait;


    public BasePage(WebDriver _browser) {
        browser = _browser;
    }

    public void waitElementVisible(By element, int seconds) {
        wait = new WebDriverWait(browser, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void scrollPage(By element) {
        WebElement webElement = browser.findElement(element);
        JavascriptExecutor jse2 = (JavascriptExecutor)browser;
        jse2.executeScript("arguments[0].scrollIntoView()", webElement);
    }
}
