package PageObject_Express;

import Reusable_library.Abstract_Class;
import Reusable_library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Billing_info extends Abstract_Class {

    public Shipping_Billing_info(WebDriver driver) {
        ExtentTest logger;
        //page factory command
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor

    @FindBy(xpath = "//*[@name ='shipping.line1']")
    WebElement Streetaddress;
    @FindBy(xpath = "//*[@name='shipping.postalCode']")
    WebElement zipcode;
    @FindBy(xpath = "//*[@name='shipping.city']")
    WebElement City;
    @FindBy(xpath = "//*[@name='shipping.state']")
    WebElement State;
    @FindBy(xpath = " //*[text()='Continue']")
    WebElement CLICKcontinue;

    public void Street(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,Streetaddress,userValue,logger,"street");
    }//end of street address
    public void zip(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,zipcode,userValue,logger,"ZipCode");
    }//end of enter ZipCode
    public void entercity(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,City,userValue,logger,"City");
    }//end of enter City
    public void Enterstate(String userValue){
        Reusable_Actions_PageObject.dropdownByText(driver,State,userValue,logger,"State");
    }//end of enter state
    public void Ccontinue(){
        Reusable_Actions_PageObject.clickOnElement(driver,CLICKcontinue,logger,"Continue");
    }//end of continue



}//end of Shipping_billing_info
