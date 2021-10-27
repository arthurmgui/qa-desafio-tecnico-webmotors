package page_object;

import base_das_classes.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private String url = "https://www.webmotors.com.br/";
    private By btnOfertas = By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[2]/div/div/a");

    public HomePage(WebDriver _browser) {
        super(_browser);
    }

    public void openWebMotors() {
        browser.get(url);
    }
}
