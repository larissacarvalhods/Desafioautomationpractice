package  pageObjetcs;

import  elementMapper.LoginPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    @Step("Preencheu o campo e-mail")
    public void fillEmail(String text) {
        email.sendKeys(text);
    }
    @Step("Preencheu o campo password")
    public void fillpassword(String text) {
        password.sendKeys(text);
    }
    @Step("Clicou em Sing in")
    public void clickBtnSubmitLogin() {
        btnSubmit.click();
    }
    @Step("Preencheu o campo e-mail")
    public void fillEmailcreatAccount(String text) {
        emailCreat.sendKeys(text);
    }
    @Step("Clicou em CreatAccount")
    public void clickBtnCreatAccount() {
        submitCreate.click();
    }
}


