package test.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

    protected DriverOperations navigate() {
        driver.navigate();
        return this;
    }

    protected DriverOperations findElement(WebElement element, Object By) {
        element.findElement((org.openqa.selenium.By) By);
        return this;
    }

    protected String windowHandles(String text) {
        driver.getWindowHandle();
        return text;
    }

    protected DriverOperations click(WebElement element) {
        element.click();
        return this;
    }

    protected DriverOperations switchTo(WebElement element) {
        driver.switchTo();
        return this;

    }

    protected DriverOperations equals(String text) {
        driver.equals(text);
        return this;
    }

    protected DriverOperations wait(long time, int nano) throws InterruptedException {
        driver.wait(time, nano);
        return this;

    }

}
