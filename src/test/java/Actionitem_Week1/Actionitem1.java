package Actionitem_Week1;

public class Actionitem1 {
    public static void main(String[] args) {

        String[] zipcode;
        int[] streetnumber;

        //set length of array for zipcode
        zipcode = new String[4];
        zipcode[0] = "11230";
        zipcode[1] = "11231";
        zipcode[2] = "11232";
        zipcode[3] = "11233";

        //set length of array for street number
        streetnumber = new int[4];
        streetnumber[0] = 10;
        streetnumber[1] = 11;
        streetnumber[2] = 12;
        streetnumber[3] = 13;

        //set iteration to loop all values of zipcodes and streetnumbers

        for (int i = 0; i < 4; i++) {

            //print all values in one print statement

            System.out.println("My zip code is " + zipcode[i] + " and my street number is " + streetnumber[i]);
        }//end of loop


    }//end of main method


}//end of action item
