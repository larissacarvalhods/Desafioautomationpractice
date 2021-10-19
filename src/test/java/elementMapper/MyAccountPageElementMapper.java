package  elementMapper;

import org.junit.FixMethodOrder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class MyAccountPageElementMapper {


    @FindBy (css = "#header [class=\"account\"] >span")
    public WebElement nameUser;


    @FindBy(css= "#center_column .page-heading")
    public WebElement titlePage;

}



