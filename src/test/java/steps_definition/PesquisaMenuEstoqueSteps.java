package steps_definition;

import base_das_classes.BaseSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import gherkin.lexer.Es;
import org.junit.Assert;
import page_object.EstoquePage;
import page_object.HomePage;

public class PesquisaMenuEstoqueSteps extends BaseSteps {

    HomePage pageHome = new HomePage(BaseSteps.browser);
    EstoquePage pageEstoque = new EstoquePage(BaseSteps.browser);

    /**
     * Cenario: pesquisa do carro
     */
    @Dado("^que na pagina inicial clico no botao de ofertas$")
    public void que_na_pagina_inicial_clico_no_botao_de_ofertas() {
        pageHome.openWebMotors();
        pageHome.clickBtnOfertas();
    }

    @Quando("^preencho o campo de marca$")
    public void preencho_o_campo_de_marca() {
        pageEstoque.clickFiltroDeMarcas();
        pageEstoque.escolherMarca("Honda");
    }

    @E("^preencho o campo de modelo$")
    public void preencho_o_campo_de_modelo() {
        pageEstoque.clickFiltroDeModelo();
        pageEstoque.escolherModelo("City");
    }

    @E("^preencho o campo de versao$")
    public void preencho_o_campo_de_versao() {
        pageEstoque.clickFiltroDeVersao();
        pageEstoque.escolherVersao();
    }

    @Entao("^o sistema mostra os veiculos$")
    public void o_sistema_mostra_os_veiculos() throws InterruptedException {
        String txtNoTeste = pageEstoque.resultadoPesqCarro();
        String txtEsperado = "carros encontrados";
        Assert.assertTrue(txtNoTeste.contains(txtEsperado));
    }

    /**
     * Cenario: pesquisa do carro com marca invalida
     */
    @Quando("^preencho o campo com uma marca invalida$")
    public void preenchoOCampoComUmaMarcaInvalida() {
    }

    @Entao("^o sistema mostra que nao ha resultados$")
    public void oSistemaMostraQueNaoHaResultados() {
    }

    /**
     *   Cenario: pesquisa do carro com modelo invalido
     */
    @E("^preencho o campo com um modelo invalido$")
    public void preenchoOCampoComUmModeloInvalido() {
    }

    /**
     *     Cenario: pesquisa do carro com versao invalida
     */
    @E("^preencho o campo com uma versao invalida$")
    public void preenchoOCampoComUmaVersaoInvalida() {
    }
}
