package  pageObjetcs;

import  elementMapper.HomePageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePage extends HomePageElementMapper {


    public HomePage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickBtnLogim() {
        login.click();
    }

    public void clickSearchQueryTop() {
        search_query_top.click();
    }

    public void sendKeysSearchQueryTop(String text) {
        search_query_top.sendKeys(text);
    }

    public void clickSubmitSearch() {
        submit_search.click();

    }

    public void doSearch(String text) {
        clickSearchQueryTop();
        sendKeysSearchQueryTop(text);
        clickSubmitSearch();

    }

    public void clickCategoryTshirts() {
        menuTshirts.click();
    }
}
