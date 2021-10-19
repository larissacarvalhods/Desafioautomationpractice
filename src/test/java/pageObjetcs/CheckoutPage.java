package  pageObjetcs;

import  elementMapper.CheckoutPageElementMapper;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testes.BaseTests;
import utils.Browser;

import static utils.Browser.driver;


public class CheckoutPage extends CheckoutPageElementMapper {

    public CheckoutPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Clicou em ProceedToCheckout")
    public void clickProceedToCheckoutSumary() {
        buttonProceedToCheckoutSumary.click();
    }
    @Step("Clicou em proceed to checkout")
    public void clickProceedToCheckout() {
        buttonProceedToCheckout.click();
    }
    @Step("Adicionou um comentário sobre seu pedido")
    public void fillAddCommentOrder(String text) {

        message.sendKeys(text);
    }
    @Step( " Clicou em aceitar termos de serviço")
    public void selectAceptTermsOfService() {
        cgv.click();
    }

    @Step("Selecionou o método de pagamento por transferência bancária")
    public void selectPaymanetMethod() {
        payByBank.click();
    }
    @Step("Clicou em confirmar pedido")
    public void clickConfirmOrder() {
        confirmOrder.click();
    }

    public String getConfirmBuy() {
        return confirmBuy.getText();
    }

    public String authenticationPageCheckout() {
        return titlePage.getText();

    }
}