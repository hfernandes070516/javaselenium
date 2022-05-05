package info.steps;

import info.pages.AbstractPage;
import info.pages.HomePage;
import info.utils.Constants;
import info.utils.BaseTest;
import info.utils.Utilidades;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.Cookie;

public class PredefinedStepDefinitions extends AbstractPage {

    @Dado("que eu esteja no site da maxifrota")
    public void que_eu_esteja_no_site_da_maxifrota() {
        BaseTest.navigationObj.navigateTo(Constants.baseUrl);
     }

    @Quando("acesso a tela de leve mais por menos")
    public void acesso_a_tela_de_leve_mais_por_menos() {
        final HomePage homePage = new HomePage();
        BaseTest.clickObj.clickWebElement(homePage.btnOfertas);
        BaseTest.clickObj.clickWebElement(homePage.btnKits);
    }

    @Quando("acesso a tela de saldão de desconto")
    public void acesso_a_tela_de_saldão_de_desconto() {
        final HomePage homePage = new HomePage();
        BaseTest.clickObj.clickWebElement(homePage.btnOfertas);
        homePage.clicarBtnSaldao();
    }

    @Então("deve exibir a tela de saldão corretamente")
    public void deve_exibir_a_tela_de_saldão_corretamente() {
       BaseTest.assertionObj.checkQuantityOfElements("css",1,".qd-discount-percent","maior");
    }


}