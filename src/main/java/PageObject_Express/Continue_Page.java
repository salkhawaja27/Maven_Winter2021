package PageObject_Express;

import Reusable_library.Abstract_Class;
import Reusable_library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continue_Page extends Abstract_Class {

    public Continue_Page(WebDriver driver) {
        ExtentTest logger;
        //page factory command
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor

    @FindBy(xpath = "//*[text()='Continue']")
    WebElement secondcontinue;

    public void Seccontinue(){
        Reusable_Actions_PageObject.clickOnElement(driver,secondcontinue,logger,"Continue");
    }//end of continue


}//end of Continue_page
