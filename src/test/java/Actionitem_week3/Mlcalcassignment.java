package Actionitem_week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.sql.SQLOutput;

public class Mlcalcassignment {
    public static void main(String[] args) throws InterruptedException, IOException {

        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        //put like 1.5 seconds to wait
        Thread.sleep(1500);

        String[] purchaseprice,downpayment,mortgageterm,interestrate,pmi,startmonth,startyear;

        purchaseprice = new String[3];
        purchaseprice[0]= "550000";
        purchaseprice[1]= "650000";
        purchaseprice[2]= "750000";

        downpayment = new String[3];
        downpayment[0] = "35000";
        downpayment[1] = "55000";
        downpayment[2] = "75000";

        mortgageterm = new String[3];
        mortgageterm[0] = "15";
        mortgageterm[1] = "30";
        mortgageterm[2] = "35";

        interestrate = new String[3];
        interestrate[0] = "3.5";
        interestrate[1] = "3.2";
        interestrate[2] = "2.9";

        pmi = new String[3];
        pmi[0] = ".38";
        pmi[1] = ".40";
        pmi[2] = ".42";

        startmonth = new String[3];
        startmonth[0]= "Apr";
        startmonth[1]= "Jun";
        startmonth[2]= "Jul";

        startyear = new String[3];
        startyear[0]= "2021";
        startyear[1]= "2022";
        startyear[2]= "2023";



        //set the path to drive
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //define the chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //maximize my driver
        options.addArguments("start-maximized");

        //set the driver to incognito(private)
        options.addArguments("incognito");

        //set it to headless
        //options.addArguments("headless");

        //define the webdriver
        WebDriver driver = new ChromeDriver(options);


        //end of condition

        for (int i = 0;i < purchaseprice.length; i++) {

            //navigate to mortgage calculator
            driver.navigate().to("https://www.mlcalc.com/");
            Thread.sleep(2000);

            String MortgageCalculatortitle = driver.getTitle();
            if (MortgageCalculatortitle.equals("Auto loan calculator")) {
                System.out.println("Title Matches");
            } else {
                System.out.println("Title does not match " + MortgageCalculatortitle);
            }

            //store purchase price first
            WebElement Purchaseprice = driver.findElement(By.xpath("//*[@name='ma']"));
            //clear the  previous data
            Purchaseprice.clear();
            //enter the new price value
            Purchaseprice.sendKeys(purchaseprice[i]);

            // store downpayment
            WebElement Downpayment = driver.findElement(By.xpath("//*[@name='dp']"));
            //clear data
            Downpayment.clear();
            //entering new downpayment %
            Downpayment.sendKeys(downpayment[i]);

            // store mortgage terms
            WebElement Mortgageterm = driver.findElement(By.xpath("//*[@name='mt']"));
            //clear data
            Mortgageterm.clear();
            //entering new terms
            Mortgageterm.sendKeys(mortgageterm[i]);

            // store interest rate
            WebElement Interestrate  = driver.findElement(By.xpath("//*[@name='ir']"));
            //clear data
            Interestrate.clear();
            //entering new interest rate
            Interestrate.sendKeys(interestrate[i]);

            // store PMI
            WebElement Pmi  = driver.findElement(By.xpath("//*[@name='mi']"));
            //clear data
            Pmi.clear();
            //entering new interest rate
             Pmi.sendKeys(pmi[i]);

            //select start month
            WebElement startdatemonth = driver.findElement(By.xpath("//*[@name='sm']"));
            //select the locator using Select command
            Select dropdown = new Select(startdatemonth);
            //using by visible text command select month
            dropdown.selectByVisibleText(startmonth[i]);


            //select year
            WebElement startdateyear = driver.findElement(By.xpath("//*[@id='fpdy']"));
            //select the locator using Select command
            Select dropdown2 = new Select(startdateyear);
            //using by visible text command select year 2022
            dropdown2.selectByVisibleText(startyear[i]);

            //click on Calculate button
            driver.findElement(By.xpath("//*[@value='Calculate']")).click();

            Thread.sleep(2000);

            //capture the monthly payment using findElements with first index
            String monthlyPayment = driver.findElements(By.xpath("//*[@class='big']")).get(0).getText();
            System.out.println("My monthly payment is " + monthlyPayment);

            //click on start value
            //startdateyear.click();
           // driver.findElement(By.xpath("//*[text()='"+startyear[i]))
        }


    }//end of main
}//end of class
