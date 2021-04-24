package Express_actionitem;

import Google_Page_Object.Base_Class;
import PageObject_Express.Base_Class_express;
import Reusable_library.Abstract_Class;
import org.testng.annotations.Test;

public class Express_POM extends Abstract_Class {

    @Test
    public void Expresstest() throws InterruptedException {
        driver.navigate().to("https://www.Express.com");
        Thread.sleep(2300);
        Base_Class_express.Expresshomepage().popup();
        Base_Class_express.Expresshomepage().mens();
        Base_Class_express.Expresshomepage().sweatersandhoodies();
        Thread.sleep(2000);

        Base_Class_express.Expresshomepage().


    }//end of @test

}//end of Express_POM
