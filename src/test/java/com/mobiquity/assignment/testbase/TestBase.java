package com.mobiquity.assignment.testbase;

import com.mobiquity.assignment.base.BasePage;
import com.mobiquity.assignment.enums.Browsers;
import com.mobiquity.assignment.enums.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
    public static WebDriver driver;
    protected static BasePage basePage;
    private static final String BASE_URL = "http://cafetownsend-angular-rails.herokuapp.com/login";

    public WebDriver selectBrowser(String browser){

        if(System.getProperty("os.name").toLowerCase().contains(OS.WINDOWS.name().toLowerCase())){
            if(browser.equalsIgnoreCase(Browsers.CHROME.name())){
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/java/com/mobiquity/assignment/resources/drivers/windows/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            }
            else if(browser.equalsIgnoreCase(Browsers.FIREFOX.name())){
                System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/test/java/com/mobiquity/assignment/resources/drivers/windows/geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            }

        }
        else if(System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())){
            if(browser.equalsIgnoreCase(Browsers.CHROME.name())){
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/java/com/mobiquity/assignment/resources/drivers/mac/chromedriver");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            }
            else if(browser.equalsIgnoreCase(Browsers.FIREFOX.name())){
                System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/src/test/java/com/mobiquity/assignment/resources/drivers/mac/geckodriver");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            }
        }
        basePage = new BasePage();
        basePage.setWebDriver(driver);
        driver.get(BASE_URL);
        basePage.wait(2);
        return driver;
    }
}
