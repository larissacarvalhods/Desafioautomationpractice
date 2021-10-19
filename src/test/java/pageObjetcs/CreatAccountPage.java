package  pageObjetcs;

import  elementMapper.CreatAccountPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreatAccountPage extends CreatAccountPageElementMapper {

    public CreatAccountPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    public void selectTitleMr(){
        IdGender1.click();
    }

    public void selectTitleMrs(){
        IdGender2.click();
    }
    public void fillFirstName(String text) {
        customerfirstName.sendKeys(text);
    }
    public void fillLastName(String text){
        customerLastName.sendKeys(text);
    }
    public void fillCreatPassword (String text){
        creatPasswd.sendKeys(text);

    }
    public void fillDateOfBirth( String text,String text2,String text3){
        days.sendKeys(text);
        months.sendKeys(text2);
        years.sendKeys(text3);
    }

    public void clickSignUpNewsletter () {
      newsletter.click();
    }

    public void clickReceiveSpecialOffers() {
        uniformOptin.click();
    }

    public void fillFirstNameYourAdress (String text) {
    firstName.sendKeys(text);
    }

    public void fillLastNameYourAdress( String text) {
        lastName.sendKeys(text);
    }

    public void fillCompany(String text) {
        company.sendKeys(text);
    }

    public void fillAddress(String text) {
        address1.sendKeys(text);
    }

    public void fillAddressLine2(String text) {
        address2.sendKeys(text);
    }

    public void fillCity(String text) {
        city.sendKeys(text);
    }

    public void fillState(String text) {
        idState.sendKeys(text);
        }

    public void fillPostalCode (String text) {
        postcode.sendKeys(text);
    }

    public void fillCountry(String text) {
        idCountry.sendKeys(text);
    }

    public void fillAdditionalInformation  (String text) {
        other.sendKeys(text);
    }

    public void fillHomePhone (String text) {
        phone.sendKeys(text);
    }

    public void fillMobilePhone (String text) {
        phoneMobile.sendKeys(text);
    }

    public void fillAddressAlias (String text) {
        alias.sendKeys(text);
    }

    public void clickBtnRegister () {
        register.click();
    }


}
