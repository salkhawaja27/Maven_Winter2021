package PageObject_Express;

import Reusable_library.Abstract_Class;
import Reusable_library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class clicked_sweater extends Abstract_Class {

    public clicked_sweater (WebDriver driver){
        ExtentTest logger;
        //page factory command
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//end of constructor

    //define webelements
    @FindBy(xpath = "//*[@class='_2ZSXl']")
    WebElement sweatersize;
    @FindBy(xpath = "//*[@class='btn _9yfmt _194FD _2tFXQ _3yOD6 _1Qp1L _2veMA']")
    WebElement addtobag;
    @FindBy(xpath = "//*[text()='View Bag']")
    WebElement viewbag;

    //create a method for express home
    public void size() {
        Reusable_Actions_PageObject.clickOnElement(driver, sweatersize, logger, "size");
    }//end of mens tab
    public void addsweatertobag() {
        Reusable_Actions_PageObject.clickOnElement(driver, addtobag, logger, "cart");
    }//end of mens tab
    public void bag() {
        Reusable_Actions_PageObject.clickOnElement(driver, viewbag, logger, "viewingbag");
    }//end of view bag
}//end  of Clicked sweater page
