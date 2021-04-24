package Day2_030721;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class forloopexample {

    public static void main(String[] args) {
        String[] cities;

        cities = new String[4];
        cities[0] ="Brooklyn";
        cities[1] ="Queens";
        cities[2] ="Manhattan";
        cities[3] ="Bronx";

        // Set your iteration to loop through all the values from cities
        for(int i = 0;i < cities.length; i++){
        //print out all values in one print statement
        System.out.println("My city is " + cities[i]);
        }//end of loop


        //store purchase price first
        //WebElement Purchaseprice = driver.findElement(By.xpath("//*[@name='ma']"));
        //clear the  previous data
        //Purchaseprice.clear();
        //enter the new price value
        //Purchaseprice.sendKeys("675000");

        // store downpayment
        //WebElement Downpayment = driver.findElement(By.xpath("//*[@name='dp']"));
        //clear data
        //Downpayment.clear();
        //entering new downpayment %
        //Downpayment.sendKeys("15");

        // store mortgage terms
        //WebElement mortgageterm = driver.findElement(By.xpath("//*[@name='mt']"));
        //clear data
        //mortgageterm.clear();
        //entering new terms
        //mortgageterm.sendKeys("30");

        // store interest rate
        //WebElement interestrate  = driver.findElement(By.xpath("//*[@name='ir']"));
        //clear data
        //interestrate.clear();
        //entering new interest rate
        //interestrate.sendKeys("3.2");

        // store PMI
        //WebElement Pmi  = driver.findElement(By.xpath("//*[@name='mi']"));
        //clear data
        //Pmi.clear();
        //entering new interest rate
       // Pmi.sendKeys(".41");

    }//end of main method



}//end of java class

