package Day4_031421;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearchresults {
    public static void main(String[] args) {

        //set the system property of where the driver is located so you can use it
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //define the webdriver with a variable to use
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");

    }//end of main method




}//end of java class

