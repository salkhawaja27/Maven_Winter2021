package Actionitem_week4;

import Day7_032721.Tryandcatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.sql.Driver;
import java.util.ArrayList;

public class Actonitemweek4 {
    public static void main(String[] args) throws InterruptedException {

        //kill all chrome instances that are opened
        //Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");

        Thread.sleep(1000);

        //set the path to the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //define the chromeoptions arguments
        ChromeOptions options = new ChromeOptions();

        //maximize my driver
        options.addArguments("start-maximized");

        //set the driver to incognito(private)
        options.addArguments("incognito");

        //set it to headless
        // options.addArguments("headless");
        // define the webdriver
        WebDriver driver = new ChromeDriver(options);

        //arraylist for zipcodes and locations
        ArrayList<String> Zipcodes = new ArrayList<>();
        Zipcodes.add("11230");
        Zipcodes.add("11232");
        Zipcodes.add("11234");
        ArrayList<String> locationtypes = new ArrayList<>();
        locationtypes.add("Post Office");
        locationtypes.add("Collection Boxes");
        locationtypes.add("Self-Service Kiosks");
        ArrayList<String> miles = new ArrayList<>();
        miles.add("1 Mile");
        miles.add("10 Miles");
        miles.add("20 Miles");

        for (int i = 0; i < Zipcodes.size(); i++) {


            //navigate to usps
            try {
                driver.navigate().to("https://www.usps.com");
            } catch (Exception e) {
                System.out.println("unable to navigate to Usps" + e);
            }//end navigate

            try {
                String WelcomeUSPS = driver.getTitle();
                if (WelcomeUSPS.equals("Welcome | USPS")) {
                    System.out.println("Title Matches ");
                } else {
                    System.out.println("Title does not match " + WelcomeUSPS);
                }
            } catch (Exception e) {
                System.out.println("unable to verify title" + e);
            }    //end of verifying title

            //mouse actions
            Actions actions = new Actions(driver);

            try {
                //store element as Webelement
                WebElement sendtab = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
                actions.moveToElement(sendtab).perform();
            } catch (Exception e) {
                System.out.println(" unable to hover over send tab " + e);
            }//end of hover

            Thread.sleep(1500);
            //click on 'Find Usps locations
            try {
                WebElement finduspslocations = driver.findElement(By.xpath("//*[@href='https://tools.usps.com/find-location.htm']"));
                actions.moveToElement(finduspslocations).click().perform();
            } catch (Exception e) {
                System.out.println("unable to click on find Usps locations " + e);
            }//end of click on usps locations

            try {
                WebElement zipcode = driver.findElement(By.xpath("//*[@id='city-state-input']"));
                zipcode.click();
                zipcode.sendKeys(Zipcodes.get(i));
                //end of zipcode entering

                //select dropdown1
                driver.findElement(By.xpath("//*[@value='PO']")).click();
                WebElement dropdown1 = driver.findElement(By.xpath("//*[text()='" + locationtypes.get(i) + "']"));
                actions.moveToElement(dropdown1).click().perform();

                //select dropdown1
                driver.findElement(By.xpath("//*[@id='within-select']")).click();
                WebElement dropdown2 = driver.findElement(By.xpath("//*[text()='" + miles.get(2) + "']"));
                actions.moveToElement(dropdown2).click().perform();
                Thread.sleep(2000);

                driver.findElement(By.xpath("//*[@class='btn-primary find-search-btn']")).click();
            } catch (Exception e) {
                System.out.println(" unable to perform actions" + e);
            }
            try {
            ArrayList<WebElement> searchlinks = new ArrayList<>(driver.findElements(By.xpath("//div[@class='list-item-location popover-trigger']")));
            if (i == 0) {
                searchlinks.get(i).click();
            } else if (i == 1) {
                searchlinks.get(i).click();
            }else if (i==2)   {
                searchlinks.get(i).click();

            }// end of if else condition
        }catch (Exception e) {
            System.out.println(" Unable to locate element " + e) ;
        }// end of exception
            Thread.sleep(2000);

        // capture address
        try {

            String address = driver.findElement(By.xpath("//div[@class= ' address-wrapper']")).getText();
            System.out.println("For zip code " + Zipcodes.get(i)+ ", The address is " + address);
        }catch (Exception e){
            System.out.println(" wrong input for address result "+ e);
        }// end of exception
            Thread.sleep(2000);
        // capture hours
        try {
            String hour = driver.findElement(By.xpath("//div[@class='hours-flex-section']")).getText();
            System.out.println(" the hour is " + hour);
        }catch (Exception e){
            System.out.println(" wrong hour input" + e);
        }// end of exception



    }//end of loop
    }//end of main method
}//end of class
