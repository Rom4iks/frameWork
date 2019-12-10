package pageObject.rozetka;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import pageObject.AbstractPage;

import java.util.List;

public class RozetkaMainPage extends AbstractPage {

    @FindBys(@FindBy(xpath = "//a[@class ='menu-categories__link js-menu-categories__link']"))
    List<WebElement> categoryList;
    @FindBy (xpath = "(//a[@class ='main-categories__link'])[1]")
    private WebElement lapTopCategory;
    @FindBy(xpath = "//input[@name= 'search']")
    private WebElement searchInput;

    public RozetkaMainPage(WebDriver webDriver) {
        super(webDriver);
    }


    public RozetkaSearchResultPage searchInput(String productName) {
        searchInput.sendKeys(productName, Keys.ENTER);
        return new RozetkaSearchResultPage(webDriver);
    }
}
