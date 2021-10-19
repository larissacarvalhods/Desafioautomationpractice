package  pageObjetcs;

import  elementMapper.CreatAccountPageElementMapper;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreatAccountPage extends CreatAccountPageElementMapper {

    public CreatAccountPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Escolheu o Title(Mr. or Mrs)")
    public void selectTitleMr(){
        IdGender1.click();
    }
    @Description("Bloco Your Adress")
    @Step("Escolheu o Title(Mr. or Mrs)")
    public void selectTitleMrs(){
        IdGender2.click();
    }
    @Step("Preencheu com o primeiro nome do usuário")
    public void fillFirstName(String text) {
        customerfirstName.sendKeys(text);
    }
    @Step("Preencheu com o primeiro nome do usuário")
    public void fillLastName(String text){
        customerLastName.sendKeys(text);
    }
    @Step("Inseriu uma senha")
    public void fillCreatPassword (String text){
        creatPasswd.sendKeys(text);

    }
    @Step("Preencheu a data de nascimento")
    public void fillDateOfBirth( String text,String text2,String text3){
        days.sendKeys(text);
        months.sendKeys(text2);
        years.sendKeys(text3);
    }
    @Step("Selecionou a opção Assine a nossa newsletter")
    public void clickSignUpNewsletter () {
      newsletter.click();
    }
    @Step("Selecionou a opção Receba ofertas especiais de nossos parceiros!")
    public void clickReceiveSpecialOffers() {
        uniformOptin.click();
    }
    @Step("Preencheu o primeiro nome no bloco endereço")
    public void fillFirstNameYourAdress (String text) {
    firstName.sendKeys(text);
    }
    @Step("Preencheu o segundo nome no bloco endereço")
    public void fillLastNameYourAdress( String text) {
        lastName.sendKeys(text);
    }
    @Step("Preencheu o nome da empresa")
    public void fillCompany(String text) {
        company.sendKeys(text);
    }
    @Step("Preencheu o endereço")
    public void fillAddress(String text) {
        address1.sendKeys(text);
    }
    @Step("Preencheu o endereço 2")
    public void fillAddressLine2(String text) {
        address2.sendKeys(text);
    }
    @Step("Preencheu a cidade")
    public void fillCity(String text) {
        city.sendKeys(text);
    }
    @Step("Preencheu o estado")
    public void fillState(String text) {
        idState.sendKeys(text);
        }
    @Step("Preencheu o Zip/Postal Code")
    public void fillPostalCode (String text) {
        postcode.sendKeys(text);
    }
    @Step("Preencheu o país")
    public void fillCountry(String text) {
        idCountry.sendKeys(text);
    }
    @Step("Inseriu informações adicionais")
    public void fillAdditionalInformation  (String text) {
        other.sendKeys(text);
    }
    @Step("Inseriu o telefone residencial")
    public void fillHomePhone (String text) {
        phone.sendKeys(text);
    }
    @Step("Inseriu o telefone celular")
    public void fillMobilePhone (String text) {
        phoneMobile.sendKeys(text);
    }
    @Step("Inseriu outro endereço")
    public void fillAddressAlias (String text) {
        alias.sendKeys(text);
    }
    @Step("Clicou em registrar")
    public void clickBtnRegister () {
        register.click();
    }


}
