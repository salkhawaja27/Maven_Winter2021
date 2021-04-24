package PageObject_Express;

import Reusable_library.Abstract_Class;
import Reusable_library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bag_Cart extends Abstract_Class {

    public Bag_Cart(WebDriver driver) {
        ExtentTest logger;
        //page factory command
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor

    //define webelements
    @FindBy(xpath = "//*[@value='2']")
    WebElement Quantity;
    @FindBy(xpath = "//*[@aria-label='Continue to Checkout']")
    WebElement Checkout;
    @FindBy(xpath = "//*[text()='Checkout as Guest']")
    WebElement Guestcheckout;

    //create a method for express home
    public void quantity() {
        Reusable_Actions_PageObject.clickOnElement(driver, Quantity, logger, "quantity");
    }//end of quantity

    public void checkout() {
        Reusable_Actions_PageObject.clickOnElement(driver, Checkout, logger, "Checkout");
    }//end of checkout

    public void guest() {
        Reusable_Actions_PageObject.clickOnElement(driver, Guestcheckout, logger, "guestCheckout");
    }//end of guest checkout


    // public void size(String size){
    //define the explicit wait here
    //try{
    //  explicit wait condition by.xpath("//*[text()='"+size+"']").click();
    //logpass
    //}catch(){
    //logfail
    //screenshotmethod
    // }
}////end of bag_cart tab


