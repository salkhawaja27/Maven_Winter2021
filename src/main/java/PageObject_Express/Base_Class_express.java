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

    public static sweaters_page sweaters_page (){
        sweaters_page sweaters_page = new sweaters_page(driver);
        return sweaters_page;
    }// sweaters

    public static clicked_sweater clickedsweater(){
        clicked_sweater clickedSweater = new clicked_sweater(driver);
        return clickedSweater;
    }//clicked sweater

    public static Bag_Cart Cart(){
        Bag_Cart cart = new Bag_Cart(driver);
        return cart;
    }//Cart

    public static Contact_info_checkout contactinfo(){
        Contact_info_checkout contactinfo = new Contact_info_checkout(driver);
        return contactinfo;
    }//contact info

    public static Shipping_Billing_info Billing(){
        Shipping_Billing_info Billing = new Shipping_Billing_info(driver);
        return Billing;
    }//contact info

    public static Payment Creditcardinfo(){
        Payment Creditcardinfo = new Payment(driver);
        return Creditcardinfo;
    }//contact info

    public static Continue_Page Continue(){
        Continue_Page Continue = new Continue_Page(driver);
        return Continue;
    }//contact info


}
