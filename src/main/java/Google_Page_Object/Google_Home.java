package Google_Page_Object;

import Reusable_library.Abstract_Class;
import Reusable_library.Reusable_Actions_PageObject;
import Reusable_library.Abstract_Class;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Google_Home extends Abstract_Class {

    //declare a local logger so you can use it in your page class
    ExtentTest logger;
    public Google_Home(WebDriver driver){
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //define all the WebElement you need using @FindBy concept
    @FindBy(xpath = "//*[@name='q']")
    WebElement googleSearch;
    @FindBy(xpath = "//*[@name='btnK']")
    WebElement googleSearchButton;


    //below find by is useful when you need to click on an element which doesn't have a unique property
    //so create webelement as a list than later you pass .get(index number) on your reusable actions
    @FindBy(xpath = "//*[@name='btnK']")
    List<WebElement> list;
    //create a method for google search


    public void EnterKeywordOnGoogleSearch(String userValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,googleSearch,userValue,logger,"Google Search");
    }//end of google search

    //create a method for google search button
    public void SubmitOnGoogleSearchButton(){
        Reusable_Actions_PageObject.submitOnElement(driver,googleSearchButton,logger,"Google Search button");
    }//end of google search



}
