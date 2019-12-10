package pageObject.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.Urls;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.AbstractPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RozetkaLapTopPage extends AbstractPage {

    private Random rand = new Random();

    @FindBys(@FindBy(xpath = "(//input[@id]/..)[position()<50]"))
    private List<WebElement> listFilterElements;




    public void pickRandomFilter() {
        webDriverWait.until(ExpectedConditions.visibilityOfAllElements(listFilterElements));
        ArrayList<String> categoryLinks = new ArrayList<>();
        for(WebElement element : listFilterElements){
            String url = element.getAttribute("href");
            categoryLinks.add(url);
        System.out.println(url);
    }


    }

    public void pickScreenDiagonal() {
    }

    public RozetkaLapTopPage(WebDriver webDriver) {
        super(webDriver);
    }
}
