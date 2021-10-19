package  elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatAccountPageElementMapper {

    @FindBy(id = "id_gender1")
    public WebElement IdGender1;

    @FindBy(id = "id_gender2")
    public WebElement IdGender2;

    @FindBy(id = "customer_firstname")
    public WebElement customerfirstName;

    @FindBy(id = "customer_lastname")
    public WebElement  customerLastName;

    @FindBy(id = "passwd")
    public WebElement creatPasswd ;

    @FindBy(id = "days")
    public WebElement days;

    @FindBy(id = "months")
    public WebElement months ;


    @FindBy(id = "years")
    public WebElement years ;

    @FindBy(id = "newsletter")
    public WebElement newsletter ;

    @FindBy(id = "uniform-optin")
    public WebElement  uniformOptin;

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "company")
    public WebElement company ;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "address2")
    public WebElement address2;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement idState;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(id = "id_country")
    public WebElement idCountry ;


    @FindBy(id = "other")
    public WebElement other ;


    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "phone_mobile")
    public WebElement phoneMobile;

    @FindBy(id = "alias")
    public WebElement alias ;

    @FindBy(id ="submitAccount")
    public WebElement register;


}








