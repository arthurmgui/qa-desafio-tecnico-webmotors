package steps_definition;

import base_das_classes.BaseSteps;
import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;

public class Hooks {

    @Before
    public void BeforeAllTest(Scenario _cenario) {
        BaseSteps.openBrowser();
        BaseSteps.cenario = _cenario;
    }
    @After
    public void AfterAllTest() {
//        if (BaseSteps.cenario.isFailed()) System.out.println("Teste Falhou!");
        BaseSteps.closeBrowser();
    }
}
