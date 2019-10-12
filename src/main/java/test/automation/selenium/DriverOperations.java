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

    protected DriverOperations switchToWindow(String handle) {
        driver.switchTo().window(handle);
        return this;
    }

    protected Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    protected String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    protected DriverOperations quit() {
        driver.quit();
        return this;
    }

    protected DriverOperations maximize() {
        driver.manage().window().maximize();
        return this;
    }

    protected DriverOperations fullScreen() {
        driver.manage().window().fullscreen();
        return this;
    }

    protected DriverOperations getSize() {
        driver.manage().window().getSize();
        return this;
    }

    protected DriverOperations getPosition() {
        driver.manage().window().getPosition();
        return this;
    }

    protected Boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    protected DriverOperations submit(WebElement element) {
        element.submit();
        return this;
    }

}

