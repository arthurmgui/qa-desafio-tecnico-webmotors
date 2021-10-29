package page_object;

import base_das_classes.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EstoquePage extends BasePage {

    private By filtroDeMarcas = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Filters__container > div.NavBar > div.NavBar--content > div > form > div:nth-child(5) > div.Filters__line.Filters__line__see-more.Filters__line--icon.Filters__line--icon--right.Filters__line--right");
    private By filtroDeModelos = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Filters__container > div.NavBar > div.NavBar--content > div > form > div:nth-child(5) > div.Filters__make-block > div:nth-child(2) > div.Filters__line.Filters__line--gray.Filters__line--icon.Filters__line--icon--right");
    private By filtroDeVersao = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Filters__container > div.NavBar > div.NavBar--content > div > form > div:nth-child(5) > div.Filters__make-block > div:nth-child(2) > div.Filters__line.Filters__line--icon.Filters__line--icon.Filters__line--icon--right.Filters__line--gray");
    private By campoPesqVersao = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(3) > div > input");
    private By campoPesqModelo = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div.Filters__container__group.Filters__container__group--no-border > div > input");
    private By campoPesqMarca = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(4) > div > input");
    private By marcaHonda = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(5) > a");
    private By modeloCity = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(5) > a");
    private By versaoDoCarro = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(4) > a:nth-child(2)");
    private By titleMarcaDoCarro = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Filters__container > div.NavBar > div.NavBar--content > div > form > div:nth-child(5) > div.Filters__container__group__title");
    private By txtResultadoPesquisa = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-right > div.sc-Rmtcm.fAmcAQ > p");
    private By txtResultadoInvalidoMarcModel = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(5) > div.Filters__line.Filters__line__result.Filters__line__result__error");
    private By txtResultadoInvalidoVersao = By.cssSelector("#root > main > div.container > div.Search-result.Search-result--container-left > div > div.Slide.SlideLeft.SlideLeft--opened > div > div:nth-child(4) > div.Filters__line.Filters__line__result.Filters__line__result__error");

    public EstoquePage(WebDriver _browser) {
        super(_browser);
    }

    public void clickFiltroDeMarcas() {
        waitElementVisible(titleMarcaDoCarro, 10);
        browser.findElement(titleMarcaDoCarro).click();
        scrollPage(filtroDeMarcas);
        browser.findElement(filtroDeMarcas).click();
    }

    public void escolherMarca( String _marca){
        waitElementVisible(filtroDeMarcas, 10);
        browser.findElement(campoPesqMarca).sendKeys(_marca);
        browser.findElement(marcaHonda).click();
    }

    public void clickFiltroDeModelo() {
        waitElementVisible(titleMarcaDoCarro, 10);
        browser.findElement(titleMarcaDoCarro).click();
        scrollPage(filtroDeModelos);
        browser.findElement(filtroDeModelos).click();
    }

    public void escolherModelo( String _modelo){
        waitElementVisible(filtroDeModelos, 10);
        browser.findElement(campoPesqModelo).sendKeys(_modelo);
        browser.findElement(modeloCity).click();
    }

    public void clickFiltroDeVersao() {
        waitElementVisible(titleMarcaDoCarro, 10);
        browser.findElement(titleMarcaDoCarro).click();
        scrollPage(filtroDeVersao);
        browser.findElement(filtroDeVersao).click();
    }

    public void escolherVersao(String _versao){
        waitElementVisible(filtroDeVersao, 10);
        browser.findElement(campoPesqVersao).sendKeys(_versao);
        browser.findElement(versaoDoCarro).click();
    }

    public String resultadoPesqCarro() throws InterruptedException {
        Thread.sleep(5000);
        return browser.findElement(txtResultadoPesquisa).getText();
    }

    public String resultadoPesqMarcModelInvalida() throws InterruptedException {
        Thread.sleep(5000);
        return browser.findElement(txtResultadoInvalidoMarcModel).getText();
    }

    public String resultadoPesqVersaoInvalida() throws InterruptedException {
        Thread.sleep(5000);
        return browser.findElement(txtResultadoInvalidoVersao).getText();
    }

    public void escolherMarcaInvalida( String _marca){
        waitElementVisible(filtroDeMarcas, 10);
        browser.findElement(campoPesqMarca).sendKeys(_marca);
    }

    public void escolherModeloInvalido( String _modelo){
        waitElementVisible(filtroDeModelos, 10);
        browser.findElement(campoPesqModelo).sendKeys(_modelo);
    }

    public void escolherVersaoInvalida(String _versao){
        waitElementVisible(filtroDeVersao, 10);
        browser.findElement(campoPesqVersao).sendKeys(_versao);
    }
}
