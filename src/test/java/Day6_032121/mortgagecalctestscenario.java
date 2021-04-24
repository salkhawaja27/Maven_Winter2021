package Day6_032121;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class mortgagecalctestscenario {
    public static void main(String[] args) throws InterruptedException {

        //set the path to drive
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //define the chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //maximize my driver
        options.addArguments("start-maximized");

        //set the driver to incognito(private)
        options.addArguments("incognito");

        //set it to headless
        options.addArguments("headless");

        //define the webdriver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(2000);

        //verify the title with you expected
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("mortgage Calculator")) {
            System.out.println("Title Matches");
        } else {
            System.out.println("Title does not match " + actualTitle);
        }
        //end of condition

        //store home value first
        WebElement homevalue = driver.findElement(By.xpath("//*[@id='homeval']"));
        //clear the  previous data
        homevalue.clear();
        //enter the new value
        homevalue.sendKeys("350000");

        //store downpayment first
        WebElement downpayment = driver.findElement(By.xpath("//*[@id='downpayment']"));
        //clear the  previous data
        downpayment.clear();
        //enter the new value
        downpayment.sendKeys("25000");

        //store interest rate first
        WebElement interestrate = driver.findElement(By.xpath("//*[@id='intrstsrate']"));
        //clear the  previous data
        interestrate.clear();
        //enter the new value
        interestrate.sendKeys("3.2");






        //select april on month dropdown
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));
 //select the locator using Select command
        Select dropdown = new Select(startMonth);
//using by visible text command select month April
        dropdown.selectByVisibleText("Apr");

//if dropdown is not under select tag then you have to use click command twice
//click on dropdown
//startMonth.click();
//click on dropdown value by text
//driver.findElement(By.xpath("//*[text()='May']")).click();

//click on Calculate button
        driver.findElement(By.xpath("//*[@value='Calculate']")).click();

        Thread.sleep(3000);

//capture the monthly payment using findElements with first index
        String mntPayment = driver.findElements(By.xpath("//div[@class='left-cell']")).get(0).getText();
        System.out.println("My monthly payment is " + mntPayment);

    }//end of main
}//end of class