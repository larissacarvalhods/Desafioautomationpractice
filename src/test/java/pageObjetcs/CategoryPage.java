package  pageObjetcs;

import elementMapper.CategoryPageElementMapper;
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

    public void clickProductAddToCart() {
        BasePage.mouseOver(productNameCategory);
        buttonAddCartToProductPage.click();
    }

    public void clickProceed() {
        buttonProceed.click();
    }
}
