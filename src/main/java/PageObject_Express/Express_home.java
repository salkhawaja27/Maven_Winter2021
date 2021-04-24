package PageObject_Express;

import Reusable_library.Abstract_Class;
import Reusable_library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class Express_home extends Abstract_Class {

    public Express_home(WebDriver driver){
        ExtentTest logger;
        //page factory command
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//end of constructor

    //define webelements
    @FindBy(xpath = "//button[@id= 'closeModal']")
    WebElement homepagepopup;
    @FindBy(xpath = "//*[@text()='Men']")
    WebElement menstab;
    @FindBy(xpath = "//a[text()='Sweatshirts & Hoodies']")
    WebElement sweaters;

    //create a method for express home
    public void popup(){
        Reusable_Actions_PageObject.clickOnElement(driver,homepagepopup,logger,"Homepagepopup");
    }//end of popup
    public void mens() {
        Reusable_Actions_PageObject.clickOnElement(driver, menstab, logger, "menstab");
    }//end of mens tab
    public void sweatersandhoodies() {
        Reusable_Actions_PageObject.clickOnElement(driver, sweaters, logger, "sweaters");
    }//end of mens tab


}//end of class
