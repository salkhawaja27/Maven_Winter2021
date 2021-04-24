package PageObject_Express;

import Reusable_library.Abstract_Class;
import Reusable_library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sweaters_page extends Abstract_Class {

    public sweaters_page (WebDriver driver){
        ExtentTest logger;
        //page factory command
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//end of constructor

    //define webelements
    @FindBy(xpath = "//a[@class='_1JYBt']")
    WebElement Firstsweater;


    //create a method for express home
    public void sweaterone() {
        Reusable_Actions_PageObject.clickOnElement(driver, Firstsweater, logger, "firstsweateronpage");
    }//end of sweater tab

}//end of sweaters page
