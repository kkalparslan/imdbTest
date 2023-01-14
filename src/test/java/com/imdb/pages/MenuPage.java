package com.imdb.pages;

import com.imdb.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends BasePage {

    @FindBy(xpath = "//span[@class='ipc-responsive-button__text']")
    public WebElement menuBtn_loc;

    @FindBy(xpath = "//span[.='Awards & Events']")
    public WebElement awardsAndEvents_loc;

    public void clickMenu_mtd() {
        menuBtn_loc.click();
        BrowserUtils.waitFor(2);

    }
    public void getText_mtd(String expectedTitle){
        String actualTitle = awardsAndEvents_loc.getText();
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        System.out.println("actualTitle = " + actualTitle);
    }

    @FindBy(xpath = "//span[.='Oscars']")
    public WebElement oscar_loc;

    public void clickOscar_mtd(){

        oscar_loc.click();
        BrowserUtils.waitFor(2);
    }

    @FindBy(xpath = "//a[.='1929']")
    public WebElement webElement1929_loc;

    public void click1929_mtd(){

        BrowserUtils.waitForClickablility(webElement1929_loc,3).click();
    }

    @FindBy(xpath = "//a[.='Charles Chaplin']")
    public WebElement charleyChaptin_loc;

    public void charleyBtn_mtd(){
        BrowserUtils.waitFor(2);
        BrowserUtils.waitForClickablility(charleyChaptin_loc,2).click();
    }


}
