package base;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementInfo;

public class BasePage  {


    protected WebDriver driver = baseTest.driver;
    private WebDriverWait wait = new WebDriverWait(driver, 15, 1000);

    protected WebElement waitForElement(ElementInfo info) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(info.getBy()));
    }

    protected void waitForElementAndClick(ElementInfo elementInfo) {
        waitForElement(elementInfo).click();
    }

    protected void waitForElementAndSendKeys(ElementInfo elementInfo, String text) {
        waitForElement(elementInfo).sendKeys(text);
    }

    protected String waitForElementAndGetAttribute(ElementInfo elementInfo, String attribute) {
        return waitForElement(elementInfo).getAttribute(attribute);
    }


    public boolean isElementVisible(ElementInfo info, int timeout){

        try{
            WebDriverWait wait = new WebDriverWait(driver,timeout);
            wait.until(ExpectedConditions.visibilityOfElementLocated(info.getBy()));
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public void scrollToElementWithJs(ElementInfo info) {

        WebElement element = driver.findElement(info.getBy());
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);


    }

    public String get_text_from_parent_by_postion(WebDriver driver, WebElement element, int textPosition) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (String) js.executeScript("var parent = arguments[0];var textPosition = arguments[1]; var txtPosition = 0; var child = parent.firstChild; var textValue=''; while(child) { if (child.nodeType === 3){ if (txtPosition===(textPosition-1)){ textValue = child.textContent; break;}}else{txtPosition+=1;}child = child.nextSibling; } return textValue;", element, textPosition);
    }
    public void sendKeysJs (ElementInfo element2){

        WebElement element = driver.findElement(element2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].innerText='Gönderilecek Yazı';",element);
    }

}


