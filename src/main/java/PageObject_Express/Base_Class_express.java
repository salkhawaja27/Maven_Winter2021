package PageObject_Express;

import Google_Page_Object.Google_Home;
import Reusable_library.Abstract_Class;

public class Base_Class_express extends Abstract_Class {


    //this page class is a static reference for the page object classes
    //so I can use it on my test class
    public static Express_home Expresshomepage(){
        Express_home Expresshomepage = new Express_home(driver);
        return  Expresshomepage;
    }//end of googleHomePage method


}
