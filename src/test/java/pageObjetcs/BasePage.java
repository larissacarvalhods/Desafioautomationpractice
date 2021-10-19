package  pageObjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Browser;

public class BasePage extends Browser {

    public static void mouseOver(WebElement element){

        Actions action = new Actions(Browser.getCurrentDriver());
        action.moveToElement(element).build().perform();
    }



}
