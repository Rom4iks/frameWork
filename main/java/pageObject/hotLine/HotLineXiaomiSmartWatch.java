package pageObject.hotLine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObject.AbstractPage;

import java.util.ArrayList;
import java.util.List;

public class HotLineXiaomiSmartWatch extends AbstractPage {
    @FindBy(xpath = "(//select[@class='field'])[1]")
    private WebElement sortElement;
    @FindBy(xpath = "//option[contains(text(),'возрастанию')]")
    private WebElement filterPrice;
    @FindBys(@FindBy(xpath = "(//span[@class='value'])[position()>1]"))
    private List<WebElement> listOfPrice;


    public void sortingByPrice() {
        Actions actions = new Actions(webDriver);
        actions.click(sortElement).build().perform();
        webDriverWait.until(ExpectedConditions.visibilityOf(filterPrice));
        filterPrice.click();
    }

   public ArrayList<Integer> pulledPriceList() {
        for (WebElement ele : listOfPrice
        ) {
            String texta = ele.getText();
            pulledPrices.add(Integer.valueOf(texta.replaceAll("\\s", "")));
            System.out.println(Integer.valueOf(texta.replaceAll("\\s", "")));
        }
       return pulledPrices;
    }

    public ArrayList<Integer> sortedPriceList(){

        Collections.sort(pulledPrices);

        return pulledPrices;
    }

    public HotLineXiaomiSmartWatch(WebDriver webDriver) {
        super(webDriver);
    }
}
