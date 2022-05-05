package info.pages;

import info.annotations.PageObject;
import info.dto.LoginDTO;
import info.utils.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@PageObject
public class HomePage extends AbstractPage {

    @FindBy(how = How.CSS, using = ".ofertas")
    public WebElement btnOfertas;

    @FindBy(how = How.CSS,using = "a[href='/kits-araujo']")
    public WebElement btnKits;

    @FindBy(how = How.CSS,using = "a[href='/3289?PS=16&map=productClusterIds&O=OrderByTopSaleDESC']")
    public WebElement btnSaldao;

    @FindBy(how = How.XPATH, using = "")
    public WebElement btnLogin;

    public void clicarBtnkits(){
        BaseTest.clickObj.click("css","[alt=\"bannerMenuOfertasTwo\"]");
    }

    public void clicarBtnSaldao(){
        BaseTest.clickObj.clickWebElement(btnSaldao);
    }

    public void validarQuantidadeElementos(int quantidade)  {

            BaseTest.assertionObj.checkQuantityOfElements("css",quantidade,"[alt^='leve3pague2']","greater");
    }

    public void realizarPesquisa(String texto){
        BaseTest.inputObj.enterTextByList("css",texto,"input[placeholder=\"Precisou? Araujo tem\"]",0);
        BaseTest.inputObj.sendKeyboardKey("css","input[placeholder=\"Precisou? Araujo tem\"]","enter");;
    }


}

