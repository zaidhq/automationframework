package test.automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class DriverInitializer {

    public WebDriver web(Browser browser) throws Exception {


        WebDriver driver = null;
        switch (browser) {

            case Chrome:
                driver = new ChromeDriver();
                break;

            case Edge:
                driver = new EdgeDriver();
                break;

            case Firefox:
                driver = new FirefoxDriver();
                break;

            case Safari:
                driver = new SafariDriver();
                break;

            default:
                throw new Exception("The driver is not initialized");
        }

        return driver;
    }

}

enum Browser {
    Chrome, Edge, Firefox, Safari;


}


