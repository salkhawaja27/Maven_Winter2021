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
    @FindBy(xpath = "//*[@value='dropdownvalue']")
    WebElement Quantity;
    @FindBy(xpath = "//*[@aria-label='Continue to Checkout']")
    WebElement Checkout;
    @FindBy(xpath = "//button[text()='Checkout as Guest']")
    WebElement Guestcheckout;

    //create a method for express home
    public void quantity(String userValue) {
        Reusable_Actions_PageObject.dropdownByText(driver, Quantity, userValue, logger, "quantity");
    }//end of quantity

    public void size(String size){
        //define the explicit wait here
        try{
           explicit wait condition by.xpath("//*[text()='"+size+"']").click();
           logpass
        }catch(){
            logfail
                    screenshotmethod
        }
    }

    public void checkout() {
        Reusable_Actions_PageObject.clickOnElement(driver, Checkout, logger, "Checkout");
    }//end of checkout

    public void guest() {
        Reusable_Actions_PageObject.clickOnElement(driver, Checkout, logger, "guestCheckout");
    }//end of guest checkout

}////end of bag_cart tab


