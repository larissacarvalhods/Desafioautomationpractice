package  pageObjetcs;

import  elementMapper.LoginPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class LoginPage extends LoginPageElementMapper {

    public LoginPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void fillEmail(String text) {
        email.sendKeys(text);
    }

    public void fillpassword(String text) {
        password.sendKeys(text);
    }

    public void clickBtnSubmitLogin() {
        btnSubmit.click();
    }

    public void fillEmailcreatAccount(String text) {
        emailCreat.sendKeys(text);
    }

    public void clickBtnCreatAccount() {
        submitCreate.click();
    }
}


