package common;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class BaseTest {


    protected WebDriver webDriver;
    protected PropertyHelper propertyHelper = new PropertyHelper();

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @After
    public void shutDownDriver() {
        webDriver.close();
        webDriver.quit();
    }
}

