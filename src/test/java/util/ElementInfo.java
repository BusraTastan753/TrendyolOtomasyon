package util;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementInfo extends By {
    public String assertDesc;
    public By by;

    public ElementInfo(String assertDesc, By by) {
        super();
        this.assertDesc = assertDesc;
        this.by = by;
    }

    public String getAssertDesc() {
        return assertDesc;
    }

    public void setAssertDesc(String assertDesc) {
        this.assertDesc = assertDesc;
    }

    public By getBy() {
        return by;

    }

    public void setBy(By by)
    {
        this.by = by;
    }

    @Override
    public List<WebElement> findElements(SearchContext searchContext) {
        return null;
    }
}
