package PageObject_Express;

import Reusable_library.Abstract_Class;
import Reusable_library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact_info_checkout extends Abstract_Class {

    public Contact_info_checkout(WebDriver driver) {
        ExtentTest logger;
        //page factory command
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor

    @FindBy(xpath = "//*[@name='firstname']")
    WebElement firstname;
    @FindBy(xpath = "//*[@name='lastname'] ")
    WebElement lastname;
    @FindBy(xpath = "//*[@name='email'] ")
    WebElement email;
    @FindBy(xpath = "//*[@name='confirmEmail'] ")
    WebElement confirmemail;
    @FindBy(xpath = "//*[@name='phone']")
    WebElement phonenumber;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickcontinue;

    public void Firstname(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,firstname,userValue,logger,"First name");
    }//end of first name
    public void Lastname(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,lastname,userValue,logger,"Last name");
    }//end of Last name
    public void emailaddress(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,email,userValue,logger,"email address");
    }//end of emailaddress
    public void ConfirmEmail(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,confirmemail,userValue,logger,"Confirm Email");
    }//end of Confirm Email
    public void Phonenumber(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,phonenumber,userValue,logger,"Phone Number");
    }//end of Phone number

    public void CLICKcontinue(){
        Reusable_Actions_PageObject.clickOnElement(driver,clickcontinue,logger,"Continue");
    }//end of continue



}//end of contact info_checkout
