package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageElementMapper {


    @FindBy(css =  ".button:nth-child(4) > span")
     public WebElement buttonProceedToCheckout;

    @FindBy(css =  "a[title=\"Proceed to checkout\"][class*=standard-checkout]>span")
    public WebElement buttonProceedToCheckoutSumary;

    @FindBy( name= "message")
    public WebElement message;

    @FindBy(id="cgv")
    public WebElement cgv;

    @FindBy(css = "a[title=\"Pay by bank wire\"]")
    public  WebElement payByBank;

    @FindBy(css = "#cart_navigation > button[type=\"submit\"]")
    public  WebElement confirmOrder;

    @FindBy ( css = "#center_column [class*=box]")
    public WebElement confirmBuy;

    @FindBy(css= "#center_column .page-heading")
    public WebElement titlePage;
}
