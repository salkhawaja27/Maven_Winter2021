package Day6_032121;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeoptionsexample {
    public static void main(String[] args) {

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

        //navigate to yahoo
        driver.navigate().to("https://www.yahoo.com");


    }//end of method

}//end of class
