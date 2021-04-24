package test;

import Day9_040321.Reusable_Methods;
import Reusable_library.Abstract_Class;
import Reusable_library.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class footlockerTESTNG extends Abstract_Class {

    @Test
    public void buytimberlandshoes() throws InterruptedException {
        driver.navigate().to("https://www.footlocker.com");
        Thread.sleep(3000);
        Reusable_Actions.HoverClick(driver,"//button[@class='closeButtonWhite lastFocusableElement']", logger, "close popup");
        Reusable_Actions.sendKeysMethod(driver,"//*[@id='HeaderSearch_search_query']","Timberlands", logger, "search field");
        Reusable_Actions.submitOnElement(driver,"//button[@aria-label='Search submit']", logger, "Click on search");
        Reusable_Actions.HoverClick(driver,"//div[@class='ProductCard']",logger, "Click on 1st timberland");
        Thread.sleep(2500);
        Reusable_Actions.clickOnElement(driver,"//*[text()='09.0']", logger, "Click on size 9");
        Reusable_Actions.clickOnElement(driver,"//*[text()='Add To Cart']",logger, "Click add to cart");
    }//end of test 1


}//end of class
