package steps_definition;

import base_das_classes.BaseSteps;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void BeforeAllTest(Scenario _cenario) throws Throwable {
        BaseSteps.openBrowser();
        BaseSteps.cenario = _cenario;
    }
    @After
    public void AfterAllTest() {
//        if (BaseSteps.cenario.isFailed()) System.out.println("Teste Falhou!");
        BaseSteps.closeBrowser();
    }
}
