package steps_definition;

import base_das_classes.BaseSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import page_object.HomePage;

public class PesquisaMenuEstoqueSteps extends BaseSteps {

    HomePage pageHome = new HomePage(BaseSteps.browser);

    @Dado("^que na pagina inicial clico no botao de ofertas$")
    public void que_na_pagina_inicial_clico_no_botao_de_ofertas() {
        pageHome.openWebMotors();

    }

    @Quando("^preencho o campo de marca$")
    public void preencho_o_campo_de_marca() {
    }

    @E("^preencho o campo de modelo$")
    public void preencho_o_campo_de_modelo() {
    }

    @E("^preencho o campo de versao$")
    public void preencho_o_campo_de_versao() {
    }

    @Entao("^o sistema mostra os veiculos$")
    public void o_sistema_mostra_os_veiculos() {
    }
}
