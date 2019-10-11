package test.automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Set;

abstract public class DriverOperations {

    WebDriver driver;


    protected DriverOperations getUrl(String url) {
        driver.get(url);
        return this;
    }

    protected DriverOperations sendKeys(WebElement element, String text) {
        element.sendKeys(text);
        return this;
    }

    protected DriverOperations close() {
        driver.close();
        return this;
    }

    protected DriverOperations navigateBack() {
        driver.navigate().back();
        return this;
    }

    protected String windowHandle() {
        return driver.getWindowHandle();
    }

    protected DriverOperations click(WebElement element) {
        element.click();
        return this;
    }

    protected DriverOperations switchTo(WebElement element) {
        driver.switchTo();
        return this;
    }

    protected Set<String> windowHandles() {
        return driver.getWindowHandles();
    }
}
