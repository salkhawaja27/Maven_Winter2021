package Express_actionitem;

import Google_Page_Object.Base_Class;
import PageObject_Express.Base_Class_express;
import Reusable_library.Abstract_Class;
import Reusable_library.Reusable_Actions;
import com.relevantcodes.extentreports.LogStatus;
import jxl.write.Label;
import org.jsoup.Connection;
import org.testng.annotations.Test;

public class Express_POM extends Abstract_Class {

    @Test
    public void Expresstest() throws InterruptedException {
        driver.navigate().to("https://www.Express.com");
        Thread.sleep(1500);
        Base_Class_express.Expresshomepage().popup();
        Base_Class_express.Expresshomepage().mens();
        Base_Class_express.Expresshomepage().sweatersandhoodies();
        Thread.sleep(2000);

        Base_Class_express.sweaters_page().Sweater1();
        Thread.sleep(2000);

        Base_Class_express.clickedsweater().size();
        Base_Class_express.clickedsweater().addsweatertobag();
        Base_Class_express.clickedsweater().bag();
        Thread.sleep(2000);

        Base_Class_express.Cart().quantity();
        Base_Class_express.Cart().checkout();
        Thread.sleep(2000);
        Base_Class_express.Cart().guest();
        Thread.sleep(2000);

        Base_Class_express.contactinfo().Firstname("Billie");
        Base_Class_express.contactinfo().Lastname("Jean");
        Base_Class_express.contactinfo().emailaddress("Billiejean@gmail.com");
        Base_Class_express.contactinfo().ConfirmEmail("Billiejean@gmail.com");
        Base_Class_express.contactinfo().Phonenumber("7181234567");
        Base_Class_express.contactinfo().CLICKcontinue();
        Thread.sleep(2000);

        Base_Class_express.Billing().Street("123 Ave i");
        Base_Class_express.Billing().zip("11235");
        Base_Class_express.Billing().entercity("Brooklyn");
        Base_Class_express.Billing().Enterstate("NY");
        Base_Class_express.Billing().Ccontinue();

        Base_Class_express.Continue().Seccontinue();
        Thread.sleep(2000);

        Base_Class_express.Creditcardinfo().creditcard("3458536787657685");
        Base_Class_express.Creditcardinfo().Expirationmonth("02");
        Base_Class_express.Creditcardinfo().Expirationyear("27");
        Base_Class_express.Creditcardinfo().Cvvcode("478");
        Base_Class_express.Creditcardinfo().PlaceOrder();



    }//end of @test

}//end of Express_POM
