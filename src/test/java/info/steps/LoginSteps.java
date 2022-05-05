package info.steps;

import info.dto.LoginDTO;
import info.pages.AbstractPage;
import info.utils.BaseTest;
import info.utils.Constants;
import info.utils.Utilidades;
import io.cucumber.java.pt.*;
import io.restassured.RestAssured;

import static org.hamcrest.Matchers.*;

import static  io.restassured.RestAssured.*;


public class LoginSteps extends AbstractPage {

    @Dado("verifico o acesso do usuário")
    public void veriifico_o_acesso_do_usuário() {
        RestAssured.baseURI = Constants.baseUrl;

        given()
                //.log().all()
               .when()
               .get("no-cache/profileSystem/getProfile")
               .then()
                //.log().all()
               .statusCode(200)
               .body("IsUserDefined", is(false))
               ;
    }

    @Quando("acesso a tela de login")
    public void acesso_a_tela_de_login() {
        BaseTest.clickObj.click("id","login");
        BaseTest.clickObj.clickByText("Minha Conta");

    }

    @Quando("realizo o login")
    public void realizo_o_login() {

        LoginDTO login = new LoginDTO(faker.internet().emailAddress(), null, null);

        BaseTest.clickObj.click("css","li[ng-show=\"auth.showAccessKeyAuthentication\"]");
        Utilidades.waitSeconds(1);
        BaseTest.inputObj.enterText("id",login.getEmail(),"appendedInputButton");
    }

    @Então("deve exibir a tela de login")
    public void deve_exibir_a_tela_de_login() {
       BaseTest.assertionObj.checkTextIsVisible("Por favor informe seu email",true);
       BaseTest.assertionObj.checkElementText("id","Confirmar","sendAccessKeyBtn",true);
    }

    @Dado("que o usuário informou seu usuário e senha")
    public void que_o_usuário_informou_seu_usuário_e_senha() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Quando("clicar em {string}")
    public void clicar_em(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Então("deve ser direcionado para a home do sistema")
    public void deve_ser_direcionado_para_a_home_do_sistema() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
