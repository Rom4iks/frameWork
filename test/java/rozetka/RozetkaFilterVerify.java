package rozetka;

import common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pageObject.rozetka.RozetkaOneFilterPicked;
import pageObject.rozetka.RozetkaSearchResultPage;
import pageObject.rozetka.RozetkaLapTopPage;
import pageObject.rozetka.RozetkaMainPage;

public class RozetkaFilterVerify extends BaseTest {

    @Test
    public void rozetkaVerifyFilterChoice() throws InterruptedException {
        String rozetkaUrl = propertyHelper.readProperty("rozetka.site.url");
        webDriver.get(rozetkaUrl);
        RozetkaMainPage mainPage = new RozetkaMainPage(webDriver);
        RozetkaSearchResultPage searchResultPage = mainPage.searchInput("Dell");
        RozetkaLapTopPage lapTopPage =  searchResultPage.clickOnLapTop();
        lapTopPage.pickRandomFilter();


    }



}
