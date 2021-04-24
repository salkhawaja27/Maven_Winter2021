package Actionitem_week5;

import Day9_040321.Reusable_Methods;
import Reusable_library.Abstract_Class;
import Reusable_library.Reusable_Actions;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

public class Actionitem_express_website extends Abstract_Class {

    @Test
    public void Express() throws IOException, InterruptedException, BiffException, WriteException {

        driver = Reusable_Actions.defineTheDriver();
        //Step1: locate the path for readable file that we created in excel
        Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/Express.xls"));

        //Step 2: create a writable workbook that will mimic the data from readable
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/Express_Result.xls"), readableBook);

        //Ste3 : read everything from writable sheet
        WritableSheet writableSheet = writableWorkbook.getSheet(0);

        //Step 4: get the row count
        int rowCount = writableSheet.getRows();


        //columns are hard coded and row is dynamic(i)
        String size = writableSheet.getCell(0, 0).getContents();
        String quantity = writableSheet.getCell(1, 0).getContents();
        String firstname = writableSheet.getCell(2, 0).getContents();
        String lastname = writableSheet.getCell(3, 0).getContents();
        String email = writableSheet.getCell(4, 0).getContents();
        String phone = writableSheet.getCell(5, 0).getContents();
        String streetAddress = writableSheet.getCell(6, 0).getContents();
        String zipcode = writableSheet.getCell(7, 0).getContents();
        String city = writableSheet.getCell(8, 0).getContents();
        String state = writableSheet.getCell(9, 0).getContents();
        String ccNumber = writableSheet.getCell(10, 0).getContents();
        String expMonth = writableSheet.getCell(11, 0).getContents();
        String expYear = writableSheet.getCell(12, 0).getContents();
        String cvvCode = writableSheet.getCell(13, 0).getContents();

        // navigate to express
        driver.navigate().to("https://www.express.com");
        // delete cookie
        driver.manage().deleteAllCookies();
        Thread.sleep(2000);
        // X popup
        Reusable_Actions.clickOnElement(driver, "//button[@id= 'closeModal']", logger, "x button");

        //hover to the mens section
        Thread.sleep(1000);
        Reusable_Actions.mouseHover(driver, "//*[@text()='Men']", logger, "Men");

        //click on sweaters

        Thread.sleep(1000);
        Reusable_Actions.clickOnElement(driver, "//a[text()='Sweatshirts & Hoodies']", logger, "Sweaters");

        //click on a sweater
        Thread.sleep(3000);
        Reusable_Actions.clickOnElement(driver, "//a[@class='_1JYBt']", logger, "first Sweater");

        Thread.sleep(2000);
        //click on size
        Reusable_Actions.clickOnElement(driver, "//*[@class='_2ZSXl']", logger, "sizes");

        //click on add to bag
        Thread.sleep(500);
        Reusable_Actions.clickOnElement(driver, "//*[@class='btn _9yfmt _194FD _2tFXQ _3yOD6 _1Qp1L _2veMA']", logger, "Add to bag");

        //click on view bag
        Thread.sleep(1000);
        Reusable_Actions.clickOnElement(driver, "//*[text()='View Bag']", logger, "click on cart");

        //quantity
        Reusable_Actions.clickOnElement(driver, "//*[@value='" + quantity + "']", logger, "number");

        //CLick on checkout
        Reusable_Actions.clickOnElement(driver, "//*[@aria-label='Continue to Checkout']", logger, "continue to check out");

        //click on continue as guest
        Reusable_Actions.clickOnElement(driver, "//button[text()='Checkout as Guest']", logger, "continue to check out");


        //Enter first name
        Reusable_Actions.sendKeysMethod(driver, "//*[@name='firstname']", firstname, logger, "firstnamee");

        //Enter last name
        Reusable_Actions.sendKeysMethod(driver, "//*[@name='lastname'] ", lastname, logger, "lastnamee");

        //Enter Email
        Reusable_Actions.sendKeysMethod(driver, "//*[@name='email'] ", email, logger, "email");

        //reenter email
        Reusable_Actions.sendKeysMethod(driver, "//*[@name='confirmEmail'] ", email, logger, "reemail");

        //Phone number
        Reusable_Actions.sendKeysMethod(driver, " //*[@name='phone']", phone, logger, "phonee");

        //click on continue
        Reusable_Actions.clickOnElement(driver, " //button[@type='submit']", logger, "continue");

        //enter street address
        Reusable_Actions.sendKeysMethod(driver, "//*[@name = 'shipping.line1']", streetAddress, logger, "stadress");

        //Enter zip code
        Reusable_Actions.sendKeysMethod(driver, "//*[@name='shipping.postalCode'] ", zipcode, logger, "zipcodee");

        //Enter city
        Reusable_Actions.sendKeysMethod(driver, " //*[@name='shipping.city']", city, logger, "citye");

        //Select state
        Thread.sleep(1000);
        Reusable_Actions.dropdownByText(driver, "//*[@name='shipping.state']", state, logger, "state");

        Thread.sleep(1000);
        //click on continue
        Reusable_Actions.clickOnElement(driver, " //*[text()='Continue']", logger, "continue");

        Thread.sleep(3000);
        //click on continue
        Reusable_Actions.clickOnElement(driver, "//*[text()='Continue']", logger, "2ndcontinue");

        //enter credit card number
        Thread.sleep(3000);
        Reusable_Actions.sendKeysMethod(driver, "//*[@name='creditCardNumber'] ", ccNumber, logger, "ccNumbere");

        //select expiration month
        Thread.sleep(1000);
        Reusable_Actions.dropdownByText(driver, "//*[@name='expMonth']", "Expmonth", logger, "expmonth");

        //Select expiration year
        Thread.sleep(1000);
        Reusable_Actions.dropdownByText(driver, "//*[@name='expYear']", expYear, logger, "expyear");

        //Enter cvv
        Thread.sleep(1000);
        Reusable_Actions.sendKeysMethod(driver, "//*[@name='cvv'] ", cvvCode, logger, "cvvCodee");

        //click on place order
        Thread.sleep(1000);
        Reusable_Actions.clickOnElement(driver, "//span[text()='Place Order'] ", logger, "place order");


        //capture errorMessage and write it back to excel
        String errorMessage = Reusable_Actions.captureText(driver, "//*[@id='rvn-note-NaN']", 0, logger, "captureErrorMessageXl");

        Label label = new Label(14, 0, errorMessage);
        //add the label back to the sheet
        writableSheet.addCell(label);

        //write it back to html
        Reusable_Actions.captureText(driver, "//*[@id='rvn-note-NaN']", 0, logger, "captureErrorMessageHtml");

        logger.log(LogStatus.INFO, "My error message is " + errorMessage);


        //Write back to WorkBook and close it
        writableWorkbook.write();
        writableWorkbook.close();

    }//end of test

}//end of public class