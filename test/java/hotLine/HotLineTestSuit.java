package hotLine;

import common.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pageObject.hotLine.HotLineMainPage;
import pageObject.hotLine.HotLineSelectedPage;
import pageObject.hotLine.HotLineXiaomiSmartWatch;

public class HotLineTestSuit extends BaseTest {

    @Test
    public void verifyPriceFilter() throws InterruptedException {
//        String hotLine = propertyHelper.readProperty("hotLine.site.url");
        webDriver.get("https://hotline.ua/mobile/umnye-chasy-smartwatch/387515/");
//        HotLineMainPage mainPage = new HotLineMainPage(webDriver);

//        HotLineSelectedPage selectedPage =  mainPage.selectOneCategory();

        HotLineXiaomiSmartWatch xiaomiSmartWatch = new HotLineXiaomiSmartWatch(webDriver);
        xiaomiSmartWatch.sortingByPrice();
       ArrayList<Integer> actual =  xiaomiSmartWatch.pulledPriceList();
        ArrayList<Integer> expected =  xiaomiSmartWatch.sortedPriceList();

        Assert.assertEquals("Filter working incorrectly",expected,actual);
    }
}
