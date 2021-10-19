package  pageObjetcs;

import  elementMapper.CheckoutPageElementMapper;
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

    public void clickProceedToCheckoutSumary() {
        buttonProceedToCheckoutSumary.click();
    }

    public void clickProceedToCheckout() {
        buttonProceedToCheckout.click();
    }

    public void fillAddCommentOrder(String text) {

        message.sendKeys(text);
    }

    public void selectAceptTermsOfService() {
        cgv.click();
    }

    public void selectPaymanetMethod() {
        payByBank.click();
    }

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