package  pageObjetcs;

import elementMapper.CategoryPageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CategoryPage extends CategoryPageElementMapper {

    public CategoryPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public String getAuthenticationPageTshirts() {
        return nameCategoryTshirts.getText();
    }

    public boolean isPageTshirts() {
        return getAuthenticationPageTshirts().contains("T-SHIRTS");

    }

    public void clickProductAddToProductPage() {
        BasePage.mouseOver(productNameCategory);
        buttonMoreAddToProductPage.click();
    }

    public String getProductNameCategory() {
        return productNameCategory.getText();
    }
    @Step("Adicionou o produto no carrinho")
    public void clickProductAddToCart() {
        BasePage.mouseOver(productNameCategory);
        buttonAddCartToProductPage.click();
    }
    @Step("Clicou em proceed to checkout")
    public void clickProceed() {
        buttonProceed.click();
    }
}
