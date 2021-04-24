package test;

import Day9_040321.Reusable_Methods;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class express_test {
    public static void main(String[] args) throws BiffException, IOException, InterruptedException {
        //set the driver using reusable method
        WebDriver driver = Reusable_Methods.defineTheDriver();

        //Step1: locate the path for readable file that we created in excel
        jxl.Workbook readableBook = jxl.Workbook.getWorkbook(new File("src/main/resources/Express.xls"));

        //Step 2: create a writable workbook that will mimic the data from readable
        WritableWorkbook writableWorkbook = jxl.Workbook.createWorkbook(new File("src/main/resources/Express_Result.xls"), readableBook);
        //Step 3 : read everything from writable sheet
        WritableSheet writableSheet = writableWorkbook.getSheet(0);

        //Step 4: get the row count
        int rowCount = writableSheet.getRows();

        //loop for Express starts
        for (int i = 1; i <rowCount; i++) {

            //columns in loop
            String Size = writableSheet.getCell(0, i).getContents();
            String Quantity = writableSheet.getCell(1, i).getContents();
            String FirstName = writableSheet.getCell(2, i).getContents();
            String LastName = writableSheet.getCell(3, i).getContents();
            String Email = writableSheet.getCell(4, i).getContents();
            String Phone = writableSheet.getCell(5, i).getContents();
            String StreetAddress = writableSheet.getCell(6, i).getContents();
            String Zipcode = writableSheet.getCell(7, i).getContents();
            String city = writableSheet.getCell(8, i).getContents();
            String state = writableSheet.getCell(9, i).getContents();
            String ccvnumber = writableSheet.getCell(10, i).getContents();
            String ExpMonth = writableSheet.getCell(11, i).getContents();
            String ExpYear = writableSheet.getCell(12, i).getContents();
            String CvvCode = writableSheet.getCell(13, i).getContents();

            driver.manage().deleteAllCookies();
            //navigate to express
            driver.navigate().to("https://www.express.com");
            Thread.sleep(3000);


            Reusable_Methods.clickOnElement(driver, "//button[@class='Focus Close Modal']", "popup");
            Reusable_Methods.HoverClick(driver, "//*[@role='menuitem']", "menuitem");
            Reusable_Methods.clickOnElement(driver, "//input[@class='at-element-marker']", "at-element-marker");
            Reusable_Methods.clickOnElement(driver, "//input[@text=()='Sweatshirts & Hoodies']", "Sweaters");
            Reusable_Methods.clickOnElement(driver, "//input[@text=()='_1-wQg']", "Sweater");

        }
    }//main
}//class