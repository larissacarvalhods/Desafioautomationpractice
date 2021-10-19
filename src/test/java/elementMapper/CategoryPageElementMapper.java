package  elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPageElementMapper {


    @FindBy(className = "cat-name")
    public WebElement nameCategoryTshirts;

    @FindBy(css = ".product-container")
    public WebElement  product;

    @FindBy(css = ".button[title=View]")
    public WebElement buttonMoreAddToProductPage;

    @FindBy(css = " a[title=\"Add to cart\"][class*=button]")
    public WebElement buttonAddCartToProductPage;

    @FindBy(css = ".product_list .product-name")
    public WebElement productNameCategory;

    @FindBy(css = "a[title=\"Proceed to checkout\"][class*=btn]")
    public WebElement buttonProceed;

}

