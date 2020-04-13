package com.mobiquity.assignment.testbase;

import com.mobiquity.assignment.base.BasePage;
import com.mobiquity.assignment.enums.Browsers;
import com.mobiquity.assignment.enums.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    protected static BasePage basePage;
    private static final String BASE_URL = "http://cafetownsend-angular-rails.herokuapp.com/login";
    private static final String SELENIUM_GRID_URL = "http://localhost:4545/wd/hub";

    public void selectBrowser(String browser, boolean runRemote) throws MalformedURLException {

        if (runRemote){
            if(browser.equalsIgnoreCase(Browsers.CHROME.name())) {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setBrowserName(BrowserType.CHROME);
                driver = new RemoteWebDriver(new URL(SELENIUM_GRID_URL), capabilities);
            }
            else if(browser.equalsIgnoreCase(Browsers.FIREFOX.name())){
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setBrowserName(BrowserType.FIREFOX);
                driver = new RemoteWebDriver(new URL(SELENIUM_GRID_URL), capabilities);
            }

        }

        else if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOWS.name().toLowerCase())) {
            if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/com/mobiquity/assignment/resources/drivers/windows/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/java/com/mobiquity/assignment/resources/drivers/windows/geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            }

        } else if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {
            if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/com/mobiquity/assignment/resources/drivers/mac/chromedriver");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/java/com/mobiquity/assignment/resources/drivers/mac/geckodriver");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            }
        }
        basePage = new BasePage();
        basePage.setWebDriver(driver);
        driver.get(BASE_URL);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
