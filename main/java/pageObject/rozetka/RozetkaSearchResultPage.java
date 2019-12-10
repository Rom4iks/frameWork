package pageObject.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.Urls;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObject.AbstractPage;

import java.net.URL;

public class RozetkaSearchResultPage extends AbstractPage {

    @FindBy(xpath = "(//span[@class ='categories-filter__link-title'and contains(text(),'Ноутбуки')])[1]")
    private WebElement lapTopLink;


    public RozetkaSearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }


    public RozetkaLapTopPage clickOnLapTop() {
//        webDriver.navigate().to(lapTopLink.getAttribute("href");
        webDriverWait.until(ExpectedConditions.visibilityOf(lapTopLink));
        lapTopLink.click();
        return new RozetkaLapTopPage(webDriver);
    }
}
