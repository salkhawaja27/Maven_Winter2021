package PageObject_Express;

import Reusable_library.Abstract_Class;
import Reusable_library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment extends Abstract_Class {


    public Payment(WebDriver driver) {
        ExtentTest logger;
        //page factory command
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor

    @FindBy(xpath = "//*[@name='creditCardNumber']")
    WebElement Creditcardnumber;
    @FindBy(xpath = "//*[@name='expMonth']")
    WebElement expmonth;
    @FindBy(xpath ="//*[@name='expYear']")
    WebElement expyear;
    @FindBy(xpath ="//*[@name='cvv'] ")
    WebElement Cvv;
    @FindBy(xpath ="//span[text()='Place Order']")
    WebElement Placeorder;


    public void creditcard(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,Creditcardnumber,userValue,logger,"Creditcard");
    }//end of entering Credit Card
    public void Expirationmonth(String userValue){
        Reusable_Actions_PageObject.dropdownByText(driver,expmonth,userValue,logger,"expMonth");
    }//end of ExpMonth
    public void Expirationyear(String userValue){
        Reusable_Actions_PageObject.dropdownByText(driver,expyear,userValue,logger,"expYear");
    }//end of ExpYear
    public void Cvvcode(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,Cvv,userValue,logger,"cvvcode");
    }//end of cvvcode
    public void PlaceOrder(){
        Reusable_Actions_PageObject.clickOnElement(driver,Placeorder,logger,"Place Order");
    }//end of place order

}//end of payment page
