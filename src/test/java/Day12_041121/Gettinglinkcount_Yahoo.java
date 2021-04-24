package Day12_041121;

import Day9_040321.Reusable_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;

public class Gettinglinkcount_Yahoo {

    @Test
    public void linkCount() throws IOException, InterruptedException {
        WebDriver driver = Reusable_Methods.defineTheDriver();

        driver.navigate().to("https://www.yahoo.com");

        Thread.sleep(3000);

//store the arraylist with class attribute for the links
        ArrayList<WebElement> linkCount = new ArrayList(driver.findElements(By.xpath("//*[contains(@class,'_yb_12gb1')]")));
//print out the count of the links
        System.out.println("Link count is " + linkCount.size());

        //I want to click on each link and navigate back to the home page
        for (int i = 0; i < linkCount.size(); i++) {
            driver.navigate().to("https://www.yahoo.com");
            Thread.sleep(5000);
            linkCount = new ArrayList(driver.findElements(By.xpath("//*[contains(@class,'_yb_12gb1')]")));
            linkCount.get(i).click();
            Thread.sleep(2000);
        }


    }
}