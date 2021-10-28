package page_object;

import base_das_classes.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    private String url = "https://www.webmotors.com.br/";
    private By btnOfertas = By.cssSelector("#WhiteBox > div.NavBar > div.NavBar--content > div > div > a");

    public HomePage(WebDriver _browser) {
        super(_browser);
    }

    public void openWebMotors() {
        browser.get(url);
    }

    public void clickBtnOfertas (){
        waitElementVisible(btnOfertas, 60);
        browser.findElement(btnOfertas).click();
    }
}
