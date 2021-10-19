package  elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementMapper {


    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id="SubmitLogin")
    public WebElement btnSubmit;

    @FindBy(id = "email_create")
    public WebElement emailCreat;

    @FindBy(id = "SubmitCreate")
    public WebElement  submitCreate;

}
