package  pageObjetcs;

import  elementMapper.ProductPageElementMapper;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class ProductPage extends ProductPageElementMapper {

    public ProductPage (){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public String getProductNamePDP(){
        return productNamePDP.getText();
    }

    public void  clickButtonAddToCart(){
        buttonAddToCart.click();
    }

    public void clickButtonModalProceedToCheckout(){
        buttonModalProceedToCheckout.click();
    }
}
